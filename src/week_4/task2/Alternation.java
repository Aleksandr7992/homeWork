package week_4.task2;

public class Alternation {
    private static volatile boolean turn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrinterTurn(true));
        Thread thread2 = new Thread(new PrinterTurn(false));

        thread1.start();
        thread2.start();
    }

    static class PrinterTurn implements Runnable {
        private final boolean printOne;

        public PrinterTurn (boolean printOne) {
            this.printOne = printOne;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (Alternation.class) {
                    if ((printOne && turn) || (!printOne && !turn)) {
                        System.out.println(printOne ? "1" : "2");
                        turn = !turn;
                        Alternation.class.notify();
                    } else {
                        try {
                            Alternation.class.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
            }
        }
    }
}

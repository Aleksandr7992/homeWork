package week_5;

abstract class Chain {
    public static int LEVEL1 = 1;
    public static int LEVEL2 = 2;

    protected int level;
    protected Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public void message(int level, String name) {
        if (this.level <= level) {
            display(name);
        }
        if (nextChain != null) {
            nextChain.message(level, name);
        }
    }

    abstract protected void display(String message);
}

class ChainFirst extends Chain {
    public ChainFirst(int level) {
        this.level = level;
    }

    @Override
    protected void display(String message) {
        System.out.println("Вывод: " + message);
    }
}

class ChainSecond extends Chain {
    public ChainSecond(int level) {
        this.level = level;
    }

    @Override
    protected void display(String message) {
        System.out.println("Вывод 2: " + message);
    }
}

public class ChainofResponsibility {
    public static void main(String[] args) {
        ChainFirst first = new ChainFirst(Chain.LEVEL1);
        ChainSecond second = new ChainSecond(Chain.LEVEL2);
        first.setNextChain(second);

        first.message(Chain.LEVEL1, "Level 1 Message");
        first.message(Chain.LEVEL2, "Level 2 Message");
    }
}
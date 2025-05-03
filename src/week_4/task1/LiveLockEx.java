package week_4.task1;

public class LiveLockEx {
}
class Car {
    private String name;
    public Car(String name) {
        this.name = name;
    }

    public void goToBridge(Car other) {
        while (true) {
            System.out.println(name + " хочет заехать на мост.");
            if (other.isNear()) {
                System.out.println(name + " отходит, чтобы позволить " + other.name + " отъехать.");
                continue;
            }
            System.out.println(name + " заехал на мост");
            break;
        }
    }

    public boolean isNear() {
        return Math.random() > 0.5;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Авто1");
        Car car2 = new Car("Авто2");

        Thread threadA = new Thread(() -> car1.goToBridge(car2));
        Thread threadB = new Thread(() -> car2.goToBridge(car1));
        threadA.start();
        threadB.start();
    }
}
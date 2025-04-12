package week_1.task1;

public abstract class Mammal extends Animal implements HasSpine {
    @Override
    public String getName() {
        return "Млекопитающее";
    }

    @Override
    public void hasSpine() {
        System.out.println(" имеет позвоночник.");
    }
}

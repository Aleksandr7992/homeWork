package week_1.task1;

public class Cat extends Mammal implements HasWool {
    @Override
    public String getName() {
        return "Кошка";
    }

    @Override
    public void hasWool() {
        System.out.println(" имеет шерсть.");
    }
}

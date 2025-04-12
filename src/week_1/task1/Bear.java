package week_1.task1;

public class Bear extends Mammal implements HasWool {
    @Override
    public String getName() {
        return "Медведь";
    }

    @Override
    public void hasWool() {
        System.out.println(" имеет шерсть.");
    }
}

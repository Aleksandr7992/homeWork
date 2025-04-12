package week_1.task1;

public class Whale extends Mammal implements LivesInWater{
    @Override
    public String getName() {
        return "Кит";
    }

    @Override
    public void livesInWater() {
        System.out.println(" живет в воде.");
    }
}

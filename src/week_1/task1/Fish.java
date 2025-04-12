package week_1.task1;

public class Fish extends Animal implements LivesInWater{
    @Override
    public String getName() {
        return "Рыба";
    }

    @Override
    public void livesInWater() {
        System.out.println(" Живет в воде.");
    }
}

package week_1.task2;

public class Helicopter extends Vehicles implements HasWheels, HasScrew, CarryLoads {
    private int numberWheels;
    private int numberScrew;
    private int maxWeight;

    public Helicopter(String modelName, int numberWheels, int numberScrew, int maxWeight ){
        super(modelName);
        this.numberWheels = numberWheels;
        this.numberScrew = numberScrew;
        this.maxWeight = maxWeight;
    }
    @Override
    public String getType(){
        return "Вертолет";
    }

    @Override
    public int getNumberWheels() {
        return numberWheels;
    }

    @Override
    public int getNumberScrew() {
        return numberScrew;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }
}
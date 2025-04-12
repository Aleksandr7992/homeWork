package week_1.task2;

public class Truck extends Vehicles implements HasWheels, CarryLoads {
    private int numberWheels;
    private int maxWeight;

    public Truck(String modelName, int numberWheels, int maxWeight ){
        super(modelName);
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;
    }
    @Override
    public String getType(){
        return "Грузовик";
    }

    @Override
    public int getNumberWheels() {
        return numberWheels;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }
}
package week_1.task2;

public class Airplane extends Vehicles implements HasWheels, HasScrew, HasWings, CarryLoads {
    private int numberWheels;
    private int numberScrew;
    private int numberWings;
    private int maxWeight;


    public Airplane(String modelName, int numberWheels, int numberScrew, int numberWings, int maxWeight ){
        super(modelName);
        this.numberWheels = numberWheels;
        this.numberScrew = numberScrew;
        this.numberWings = numberWings;
        this.maxWeight = maxWeight;
    }
    @Override
    public String getType(){
        return "Самолет";
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
    public int getNumberWings() {
        return numberWings;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

}

package week_1.task2;

public class Taxi extends Vehicles implements HasWheels {
    private int numberWheels;

    public Taxi(String modelName, int numberWheels ){
        super(modelName);
        this.numberWheels = numberWheels;

    }
    @Override
    public String getType(){
        return "Такси";
    }

    @Override
    public int getNumberWheels() {
        return numberWheels;
    }
}
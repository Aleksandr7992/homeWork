package week_1.task2;

public class Cutter extends Vehicles implements HasScrew, CarryLoads {
    private int numberScrew;
    private int maxWeight;

    public Cutter (String modelName, int numberScrew, int maxWeight ){
        super(modelName);
        this.numberScrew = numberScrew;
        this.maxWeight = maxWeight;
    }
    @Override
    public String getType(){
        return "Катер";
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
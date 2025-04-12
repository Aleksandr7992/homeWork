package week_1.task2;

public class Tanker extends Vehicles implements HasScrew, CarryLoads {
    private int numberScrew;
    private int maxWeight;

    public Tanker(String modelName, int numberScrew, int maxWeight ){
        super(modelName);
        this.numberScrew = numberScrew;
        this.maxWeight = maxWeight;
    }
    @Override
    public String getType(){
        return "Танкер";
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
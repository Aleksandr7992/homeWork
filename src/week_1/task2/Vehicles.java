package week_1.task2;

public abstract class Vehicles {
    private String modelName ;

    public Vehicles(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName(){
        return modelName;
        }

    public void setModelName(){
        this.modelName = modelName;
        }

    public abstract String getType();

}

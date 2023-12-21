public class Bicycle extends Vehicle{
    private String modelName;
    private int wheelsCount;
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    /* public void updateTyre() {
        System.out.println("Меняем покрышку");
    }*/
}

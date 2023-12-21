public class Truck extends Vehicle{
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount, String modelName1, int wheelsCount1) {
        super(modelName, wheelsCount);
        this.modelName = modelName1;
        this.wheelsCount = wheelsCount1;
    }

    public Truck (String modelName, int wheelsCount) {
        super();
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
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

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

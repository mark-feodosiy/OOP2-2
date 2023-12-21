public class Bicycle implements Vehicle{
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void service() {
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        if (bicycle != null) {
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
               System.out.println("Обслуживаем " + bicycle.getModelName());

                bicycle.updateTyre();
            }
        }

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

    public void check() {

    }
    /* public void updateTyre() {
        System.out.println("Меняем покрышку");
    }*/
}

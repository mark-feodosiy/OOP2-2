public class Car extends Bicycle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
       // for (int i = 0; i < getWheelsCount(); i++) {

        System.out.println("Проверяем двигатель");
    }



    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }




   /* public void service() {
        Car car = new Car("car1", 4);
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
        }
/*

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

    }*/
}

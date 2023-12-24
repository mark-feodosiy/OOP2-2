public interface Vehicle {

   void service();

    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

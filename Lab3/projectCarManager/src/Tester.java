public class Tester {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.pressStartButton();
        car1.pressAcceleratorButton();
        car1.output();

        Car car2 = new Car("Red", 100, true, true);
        car2.pressAcceleratorButton();
        car2.setColor("black");
        System.out.println("Color of car2:" + car2.getColor());
        car2.output();

    }
}

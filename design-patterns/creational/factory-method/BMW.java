public class BMW extends Car {
    public BMW() {}

    public Car createCar() {
        return new BMW();
    }
}
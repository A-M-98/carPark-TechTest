public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark(12, 5);
        Vehicle car = new Car(1);
        carPark.parkVehicle(car);
        Vehicle van = new Van(2);
        carPark.parkVehicle(van);
        Vehicle motorbike = new MotorBike(3);
        carPark.parkVehicle(motorbike);
    }
}
//generate id automatically.
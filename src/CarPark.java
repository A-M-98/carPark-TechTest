import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private int carSpaces;
    private int motorBikeSpaces;
    private List<MotorBike> motorBikesParked = new ArrayList<>();
    private List<Car> carsParked = new ArrayList<>();
    private List<Van> vansParked = new ArrayList<>();

    public CarPark(int carSpaces, int motorBikeSpaces) {
        this.carSpaces = carSpaces;
        this.motorBikeSpaces = motorBikeSpaces;
    }

    public List<MotorBike> getMotorBikesParked() {
        return motorBikesParked;
    }

    public void setMotorBikesParked(List<MotorBike> motorBikesParked) {
        this.motorBikesParked = motorBikesParked;
    }

    public List<Car> getCarParked() {
        return carsParked;
    }

    public void setCarParked(List<Car> carParked) {
        this.carsParked = carParked;
    }

    public List<Van> getVanParked() {
        return vansParked;
    }

    public void setVanParked(List<Van> vanParked) {
        this.vansParked = vanParked;
    }

    public void parkVehicle(Vehicle vehicle){
        System.out.println("There are a total of " + (carSpaces + motorBikeSpaces) + " spaces in the parking lot.");
        if(vehicle.getType().equals("Car")){
            carsParked.add((Car) vehicle);
            System.out.println("You have parked the car with an ID of " + vehicle.getId() + ".");
            if(carSpaces <= 0){
                System.out.println("The are no car spaces available in the parking lot");
                return;
            } else {
                carSpaces--;
                System.out.println(carSpaces + " car spaces available");
            }
        }
        if(vehicle.getType().equals("MotorBike")){
            motorBikesParked.add((MotorBike) vehicle);
            System.out.println("You have parked the MotorBike with an ID of " + vehicle.getId() + ".");
            if (motorBikeSpaces <= 0){
                System.out.println("There are no motorbike spaces available, you will have to park" +
                        "your motorbike in a regular (car) space");
                carSpaces--;
            } else {
                motorBikeSpaces--;
                System.out.println((carSpaces + motorBikeSpaces) + " motorbike spaces available");
            }

        }
        if(vehicle.getType().equals("Van")){
            vansParked.add((Van) vehicle);
            System.out.println("Vans will take up 3 regular (car) spaces");
            System.out.println("You have parked the van with an ID of " + vehicle.getId() + ".");
            if(carSpaces < 3){
                System.out.println("There are no van spaces available in the parking lot");
                return;
            } else {
                carSpaces-=3;
                System.out.println((carSpaces / 3) + " van spaces available");
            }
        }
        if(carSpaces == 0 && motorBikeSpaces == 0){
            System.out.println("Sorry!! The parking lot is full. There are no available spaces in the car lot");
            return;
        }
//        if(carSpaces == carSpaces && motorBikeSpaces == motorBikeSpaces){
//            System.out.println("Welcome!! The parking lot empty.");
//        }
    }
}
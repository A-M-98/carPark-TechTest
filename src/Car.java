public class Car extends Vehicle{
    public Car(int id) {
        super(id);
    }

    @Override
    public String getType() {
        return "Car";
    }

}

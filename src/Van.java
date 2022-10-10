public class Van extends Vehicle{
    public Van(int id) {
        super(id);
    }

    @Override
    public String getType() {
        return "Van";
    }
}
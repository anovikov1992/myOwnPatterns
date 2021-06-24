package fatoryMethod;

public class SeaLogistic extends Logistics{
    @Override
    public Transport createTransport() {
        return new Boat();
    }
}

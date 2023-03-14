package toy;

public class Instrument extends Toy{

    private final double weight;

    public Instrument(String name, double weight, int winRate, int qty) {
        super(name, winRate, qty);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Instrument: " + super.toString() + "; Weight: " + getWeight() + " kg";
    }
}

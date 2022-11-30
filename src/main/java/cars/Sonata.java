package cars;

public class Sonata implements Car {

    private static final int distancePerLiter = 10;
    private final int tripDistance;

    public Sonata(int distance) {
        this.tripDistance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}

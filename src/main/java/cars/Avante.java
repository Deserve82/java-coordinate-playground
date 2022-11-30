package cars;

public class Avante extends Car {

    private static final int distancePerLiter = 15;
    private final int tripDistance;

    public Avante(int distance) {
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
        return "Avante";
    }
}

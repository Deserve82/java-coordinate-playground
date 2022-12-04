package domain;

import java.util.Arrays;
import java.util.List;

public class Line {

    private Position a;
    private Position b;

    public Line(Position a, Position b) {
        this.a = a;
        this.b = b;
    }

    public double getLength() {
        return a.getDistance(b);
    }

    public List<Position> getPositions() {
        return Arrays.asList(a, b);
    }

}

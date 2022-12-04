package domain;

import java.util.Objects;

public class Position {

    private XValue x;
    private YValue y;

    public Position(int x, int y) {
        this.x = new XValue(x);
        this.y = new YValue(y);
    }

    public double getDistance(Position b) {
        int xDistance = x.getDistance(b.x);
        int yDistance = y.getDistance(b.y);
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public boolean isXValue(int value) {
        return x.isSame(value);
    }

    public boolean isYValue(int value) {
        return y.isSame(value);
    }

    public boolean isHorizontal(Position other) {
        return !x.equals(other.x) && y.equals(other.y);
    }

    public boolean isVertical(Position other) {
        return x.equals(other.x) && !y.equals(other.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(x, position.x) && Objects.equals(y, position.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public boolean isDifferent(Position other) {
        return !x.equals(other.x) && !y.equals(other.y);
    }
}

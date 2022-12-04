package domain;

import java.security.InvalidParameterException;

public class Triangle {

    private final Position a;
    private final Position b;
    private final Position c;

    public Triangle(Position a, Position b, Position c) {
        if (a.equals(b) || b.equals(c) || c.equals(a)) {
            throw new InvalidParameterException("3개의 점 중 두 개는 같을 수 없습니다.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = getS();
        return Math.sqrt(
                s * (s - a.getDistance(b)) * (s - b.getDistance(c)) * (s - c.getDistance(a)));
    }

    private double getS() {
        return (a.getDistance(b) + b.getDistance(c) + c.getDistance(a)) / 2;
    }
}

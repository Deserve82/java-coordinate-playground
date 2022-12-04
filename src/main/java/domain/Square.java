package domain;

import java.security.InvalidParameterException;

public class Square {

    private Position pivot;
    private Position horizontal;
    private Position vertical;

    public Square(Position a, Position b, Position c, Position d) {
        checkSquare(a, b, c, d);
        checkSquare(b, a, c, d);
        checkSquare(c, a, b, d);
        checkSquare(d, a, b, c);

        setSquare(a, b, c, d);
    }

    private void setSquare(Position a, Position b, Position c, Position d) {
        this.pivot = a;
        setHorizontal(b, c, d);
        setVertical(b, c, d);
    }

    private void setVertical(Position b, Position c, Position d) {
        if (pivot.isVertical(b)) {
            this.vertical = b;
            return;
        }

        if (pivot.isVertical(c)) {
            this.vertical = c;
            return;
        }

        this.vertical = d;
    }

    private void setHorizontal(Position b, Position c, Position d) {
        if (pivot.isHorizontal(b)) {
            this.horizontal = b;
            return;
        }

        if (pivot.isHorizontal(c)) {
            this.horizontal = c;
            return;
        }

        this.horizontal = d;
    }

    private void checkSquare(Position pivot, Position a, Position b, Position c) {
        int diff = countDifferent(pivot, a, b, c);
        int hori = countHorizontal(pivot, a, b, c);
        int vert = countVertical(pivot, a, b, c);

        if (diff != 1 || hori != 1 || vert != 1) {
            throw new InvalidParameterException("직사각형 또는 정사각형만 가능합니다.");
        }
    }

    private int countHorizontal(Position pivot, Position a, Position b, Position c) {
        int result = 0;

        if (pivot.isHorizontal(a)) {
            result += 1;
        }

        if (pivot.isHorizontal(b)) {
            result += 1;
        }

        if (pivot.isHorizontal(c)) {
            result += 1;
        }

        return result;
    }

    private int countVertical(Position pivot, Position a, Position b, Position c) {
        int result = 0;

        if (pivot.isVertical(a)) {
            result += 1;
        }

        if (pivot.isVertical(b)) {
            result += 1;
        }

        if (pivot.isVertical(c)) {
            result += 1;
        }
        return result;
    }

    private int countDifferent(Position pivot, Position a, Position b, Position c) {
        int result = 0;

        if (pivot.isDifferent(a)) {
            result += 1;
        }

        if (pivot.isDifferent(b)) {
            result += 1;
        }

        if (pivot.isDifferent(c)) {
            result += 1;
        }

        return result;
    }

    public double getArea() {
        return pivot.getDistance(horizontal) * pivot.getDistance(vertical);
    }
}

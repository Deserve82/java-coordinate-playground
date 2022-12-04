package domain;

import java.security.InvalidParameterException;
import java.util.Objects;

public class XValue {

    private final int value;

    public XValue(int value) {

        if (value < 0 || value > 24) {
            throw new InvalidParameterException("value is not valid");
        }

        this.value = value;
    }

    public int getDistance(XValue other) {
        return Math.abs(this.value - other.value);
    }

    public boolean isSame(int value) {
        return this.value == value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        XValue xValue = (XValue) o;
        return value == xValue.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

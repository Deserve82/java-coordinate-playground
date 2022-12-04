package domain;

import java.security.InvalidParameterException;
import java.util.Objects;

public class YValue {

    private final int value;

    public YValue(int value) {
        if (value < 0 || value > 24) {
            throw new InvalidParameterException("value is not valid");
        }

        this.value = value;
    }

    public int getDistance(YValue other) {
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
        YValue yValue = (YValue) o;
        return value == yValue.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

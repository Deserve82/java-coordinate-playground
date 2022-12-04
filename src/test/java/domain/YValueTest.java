package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;
import org.junit.jupiter.api.Test;

class YValueTest {

    @Test
    void create() {
        assertDoesNotThrow(() -> new YValue(1));
    }

    @Test
    void create_value_over24() {
        assertThrows(InvalidParameterException.class, () -> new YValue(25));
    }

    @Test
    void get_distance() {
        YValue y1 = new YValue(1);
        YValue y2 = new YValue(10);

        assertThat(y1.getDistance(y2)).isEqualTo(9);
    }
}

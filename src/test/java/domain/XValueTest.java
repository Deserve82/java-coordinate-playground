package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;
import org.junit.jupiter.api.Test;

class XValueTest {

    @Test
    void create() {
        assertDoesNotThrow(() -> new XValue(1));
    }

    @Test
    void create_value_over24() {
        assertThrows(InvalidParameterException.class, () -> new XValue(25));
    }

    @Test
    void get_distance() {
        XValue x1 = new XValue(1);
        XValue x2 = new XValue(3);

        assertThat(x1.getDistance(x2)).isEqualTo(2);
    }

}

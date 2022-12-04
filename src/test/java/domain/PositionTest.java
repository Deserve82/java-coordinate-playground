package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;
import org.junit.jupiter.api.Test;

class PositionTest {

    @Test
    void create() {
        assertDoesNotThrow(() -> new Position(1, 1));
    }

    @Test
    void create_position_over24() {
        assertThrows(InvalidParameterException.class, () -> new Position(25, 25));
    }

    @Test
    void get_distance() {
        Position a = new Position(0, 0);
        Position b = new Position(0, 5);

        assertThat(a.getDistance(b)).isEqualTo(5);
    }
}

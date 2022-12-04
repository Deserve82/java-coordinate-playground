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

    @Test
    void is_horizontal() {
        Position a = new Position(0, 5);
        Position b = new Position(1, 5);

        assertThat(a.isHorizontal(b)).isTrue();
    }

    @Test
    void is_vertical() {
        Position a = new Position(1, 3);
        Position b = new Position(1, 5);

        assertThat(a.isVertical(b)).isTrue();
    }

    @Test
    void is_different() {
        Position a = new Position(1, 3);
        Position b = new Position(2, 5);

        assertThat(a.isDifferent(b)).isTrue();
    }
}

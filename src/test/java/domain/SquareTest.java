package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void test_create() {
        Position a = new Position(10, 10);
        Position b = new Position(22, 10);
        Position c = new Position(22, 18);
        Position d = new Position(10, 18);
        assertDoesNotThrow(() -> new Square(a, b, c, d));
    }

    @Test
    void test_create_not_square() {
        Position a = new Position(1, 1);
        Position b = new Position(1, 2);
        Position c = new Position(2, 1);
        Position d = new Position(3, 3);
        assertThrows(InvalidParameterException.class, () -> new Square(a, b, c, d));
    }

    @Test
    void test_getArea() {
        Position a = new Position(10, 10);
        Position b = new Position(22, 10);
        Position c = new Position(22, 18);
        Position d = new Position(10, 18);
        Square square = new Square(a, b, c, d);

        assertThat(square.getArea()).isEqualTo(96);
    }

}

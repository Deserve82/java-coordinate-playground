package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void creat() {
        Position a = new Position(10, 10);
        Position b = new Position(14, 15);
        Position c = new Position(20, 8);
        assertDoesNotThrow(() -> new Triangle(a, b, c));
    }

    @Test
    void creat_invalid_triangle() {
        Position a = new Position(10, 10);
        Position b = new Position(10, 10);
        Position c = new Position(20, 8);
        assertThrows(InvalidParameterException.class, () -> new Triangle(a, b, c));
    }

    @Test
    void get_area() {
        Position a = new Position(10, 10);
        Position b = new Position(14, 15);
        Position c = new Position(20, 8);
        Triangle triangle = new Triangle(a, b, c);

        assertThat(triangle.getArea()).isEqualTo(29.0, offset(0.00099));
    }

}

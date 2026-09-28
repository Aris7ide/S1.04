import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodClassTest {

    @Test
    @DisplayName("El test tiene que lanzar la exception ArrayIndexOutOfBounds")
    void shouldLaunchException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> methodClass.getArrayPosition(6));
    }

    @Test
    @DisplayName("El test no lanza excepciones")
    void shouldNotLaunchException() {
        assertDoesNotThrow(() -> methodClass.getArrayPosition(3));
    }


}
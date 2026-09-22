import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class methodClassTest {

    @Test
    @DisplayName("El test tiene que lanzar la exception IndexOutOfBounds")
    void checkException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {methodClass.checkException();
        });
    }

}
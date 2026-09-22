import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    private CalculoDni calculoDni;

    @BeforeEach
    void setUp() {
        calculoDni = new CalculoDni();
    }

    @ParameterizedTest (name = "Dni: {0} -> {1}")
    @DisplayName("Convalidar que los resultados sean correctos")
    @CsvSource ({"12345678,Z",
            "00000000,T",
            "12345678, Z",
            "00000000, T",
            "87654321, X",
            "53821947, S",
            "20394812, E",
            "76543210, S",
            "11234567, X",
            "44444444, A"})
    void testCalculateLetter(int numberDni,char expectedLetter) {
        char resultLetter = calculoDni.calculateDniLetter(numberDni);

        assertEquals(expectedLetter,resultLetter);
    }


}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void toStart() {
        calculator = new Calculator();
    }

    @Test
    void calculatorStartsWithTotalZero() {
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void checkAdd() {
        calculator.operationAdd(10);
        assertThat(calculator.getTotal()).isEqualTo(10);
    }

}
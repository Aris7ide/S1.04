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

    @Test
    void checkSubtract() {
        calculator.operationAdd(30);
        calculator.operationSubtract(10);
        assertThat(calculator.getTotal()).isEqualTo(20);
    }

    @Test
    void checkMultiply() {
        calculator.operationAdd(30);
        calculator.operationMultiply(2);
        assertThat(calculator.getTotal()).isEqualTo(60);
    }

    @Test
    void checkDivide() {
        calculator.operationAdd(30);
        calculator.operationDivide(3);
        assertThat(calculator.getTotal()).isEqualTo(10);
    }

}
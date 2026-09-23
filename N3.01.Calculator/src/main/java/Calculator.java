public class Calculator {

    int total;

    public Calculator() {
        this.total = 0;
    }

    public void operationAdd(int value) {
        total = this.total + value;
    }

    public void operationSubtract(int value) {
        total = this.total - value;
    }

    public void operationMultiply(int value) {
        total = this.total * value;
    }

    public void operationDivide(int value) {
        if (value == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        total = this.total / value;
    }

    public void operationReset() {
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

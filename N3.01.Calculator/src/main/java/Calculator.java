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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

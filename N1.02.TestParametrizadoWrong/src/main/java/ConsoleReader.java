import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner scanner = new Scanner(System.in);

    static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

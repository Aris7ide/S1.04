import java.util.ArrayList;
import java.util.List;

public class excepcionClass {

    static List<Integer> newList = new ArrayList<>();

    public static void exception() {
        newList.get(3);
    }
}

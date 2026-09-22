import java.util.ArrayList;
import java.util.List;

public class methodClass {
    private static List<Integer> list = new ArrayList<>();

    public static int checkException() {
        return list.get(4);
    }
}

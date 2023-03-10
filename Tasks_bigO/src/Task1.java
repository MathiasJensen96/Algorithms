import java.util.ArrayList;

public class Task1 {
    public int linearSearch(int n, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return list.get(i);
            }
        }
        return 0;
    }
}

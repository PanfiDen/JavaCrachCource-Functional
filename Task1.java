import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 1. Дано список цілих чисел. Знайти середнє всіх непарних чисел, що діляться на 5.
 */

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 10, 5));

        System.out.println(removeEven(list));
    }

    private static Integer removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for (Integer value : list) {
            if (value % 2 != 0 && value % 5 == 0) {
                result.add(value);
                sum += value;
            }
        }
        return sum / (result.size());
    }
}

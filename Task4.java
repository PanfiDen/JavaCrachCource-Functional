import java.util.ArrayList;
import java.util.Arrays;

/**
 * Дано список цілих чисел, вивести рядок, що є конкатенацією представлення рядковим типом  цих чисел.
 *
 * Приклад: список {5, 2, 4, 2, 1}
 * Результуючий рядок: "52421"
 */

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,4,8,9));
        System.out.println(concatList(list));
    }

    private static String concatList(ArrayList <Integer> list){
        String result = String.valueOf(list.get(0));
        for (int i = 1; i < list.size(); i++){
            result += String.valueOf(list.get(i));
        }

        return result;
    }
}

import java.util.*;

/**3. Дана Map <String, Integer>. Знайти суму всіх значень, довжина ключів яких менше 7 символів.*/

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vegetables", 1);
        map.put("water", 2);
        map.put("cigarettes", 3);
        map.put("candy", 4);
        map.put("chocolate", 5);
        map.put("milk", 6);
        map.put("eggs", 7);
        map.put("macaroni", 8);
        map.put("tea", 9);
        System.out.println(sumValueMap(map));
    }

    public static Integer sumValueMap(Map<String, Integer> map) {
        int sum = 0;
        for (String key : map.keySet()) {
            if (key != null) {
                if (key.length() < 7) {
                    sum += map.get(key);
                    System.out.println(key);
                }
            }
        }
        return sum;
    }
}

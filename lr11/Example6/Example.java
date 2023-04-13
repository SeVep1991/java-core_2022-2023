package lr11.Example6;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(0, "ноль");
    map.put(1, "один");
    map.put(2, "два");
    map.put(3, "три");
    map.put(4, "четыре");
    map.put(5, "пять");
    map.put(6, "шесть");
    map.put(7, "семь");
    map.put(8, "восемь");
    map.put(9, "девять");

    System.out.println("Строки, где ключ больше 5:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        if (entry.getKey() > 5) {
            System.out.println(entry.getValue());
        }
    }

    System.out.println("Строки, где ключ = 0:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        if (entry.getKey() == 0) {
            System.out.println(entry.getValue());
        }
    }

    System.out.println("Умножение всех ключей, где длина строки > 5:");
    int result = 1;
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        if (entry.getValue().length() > 5) {
            result *= entry.getKey();
        }
    }
    System.out.println(result);
}
}

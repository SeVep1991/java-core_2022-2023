package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<Integer> list = new ArrayList<Integer>(a);



        for (int i = 0; i < a; i++) {
            list.add(random.nextInt(1000));
        }

        System.out.println("Список до: ");
        System.out.println(list);

        System.out.println("Введите делитель: ");
        int b = in.nextInt();

        List<Integer> listResult = filter(list, b);

        System.out.println("Список после: ");
        System.out.println(listResult);
    }

    public static List<Integer> filter(List<Integer> arr, int b) {
        return arr.stream().filter(x -> x % b == 0).collect(Collectors.toList());
    }
}

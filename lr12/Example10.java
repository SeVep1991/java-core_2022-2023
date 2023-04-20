package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = in.nextInt();

        List<Integer> list = new ArrayList<Integer>(a);
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            list.add(random.nextInt(1000));
        }

        System.out.println("Список до: ");
        System.out.println(list);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        List<Integer> listResult = filter(list, num);

        System.out.println("Список после: ");
        System.out.println(listResult);
    }

    public static List<Integer> filter(List<Integer> arr, int num) {
        return arr.stream().filter(x -> x < num).collect(Collectors.toList());
    }
}
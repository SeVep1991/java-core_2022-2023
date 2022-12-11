package lr3;

import java.util.Scanner;

public class Example5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int a = in.nextInt();

        int sum = 0;
        for (int i = 0; a > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.printf("%d, ", i);
                sum = sum + i;
                a--;
            }
        }
        System.out.printf("сумма чисел: %d", sum);
    }
}
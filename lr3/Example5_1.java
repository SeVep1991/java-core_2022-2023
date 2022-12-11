package lr3;

import java.util.Scanner;
import java.util.Random;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int a = in.nextInt();

        int sum = 0;
        Random random = new Random();
        int a1 = a;
        while (a1 > 0) {
            int b = random.nextInt(1000);
            if (b % 5 == 2 || b % 3 == 1) {
                System.out.printf("%d, ", b);
                sum = sum + b;
                a1--;
            }
        }
        System.out.printf("сумма чисел: %d", sum);
    }
}

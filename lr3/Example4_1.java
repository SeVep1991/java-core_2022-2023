package lr3;

import java.util.Scanner;

public class Example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        if (a > b) {
            while (b <= a) {
                System.out.printf("%d, ", b);
                b++;
            }
        } else {
            while (a <= b) {
                System.out.printf("%d, ", a);
                a++;

            }
        }
    }
}
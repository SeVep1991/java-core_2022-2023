package lr3;

import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        if (a > b) {
            for (int b1 = b; b1 <= a; b1++) {
                System.out.printf("%d, ", b1);
            }
        } else {
            for (int a1 = a; a1 <= b; a1++) {
                System.out.printf("%d, ", a1);
            }
        }
    }
}
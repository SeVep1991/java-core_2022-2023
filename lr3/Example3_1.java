package lr3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел Фибоначчи: ");
        int a = in.nextInt();

        int i = a;
        long b = 0;
        long c = 1;
        long d = 1;
        while (i > 0) {
            System.out.printf("%d, ", d);
            d = b + c;
            b = c;
            c = d;
            i--;
        }

    }
}

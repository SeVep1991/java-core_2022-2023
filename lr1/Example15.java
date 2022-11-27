package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: "); // Введите первое число
        int a = in.nextInt();

        System.out.println("Enter the second number: "); // Введите второе число
        int b = in.nextInt();

        int c = a + b;

        int f = a - b;

        System.out.printf("Sum of numbers: " + c + " Difference of numbers: " + f); // Сумма чисел:  ... Разность чисел: ...
        in.close();
    }
}

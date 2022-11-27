package lr1;

import java.util.Scanner;


public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: "); // Введите число
        int b = in.nextInt();

        int a = b - 1;

        int c = b + 1;

        int f = (a + b + c) * (a + b + c);

        System.out.printf("Answer " + a + " " + b + " " + c + " " + f); // Ответ
        in.close();
    }
}

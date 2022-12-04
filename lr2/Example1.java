package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();

        int result = a % 3;
        System.out.println("result = " + result);
        if (result == 0) {
            System.out.println("Введеное число делится на три без остатка");
        } else {
            System.out.println("Введеное число не делится на три без остатка");
        }
    }
}

package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();

        int result = (a % 4 );
        System.out.println("result = " + result);
        if (result == 0 && a > 9) {
                    System.out.println("Удовлетворяет критериям ");
                } else {
                    System.out.println("Не удовлетворяет критериям ");
                }
            }
}

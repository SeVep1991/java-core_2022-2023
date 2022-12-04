package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();

        if (4 < a && a < 11 ) {
                System.out.println("Удовлетворяет критериям ");
            } else{
                System.out.println("Не удовлетворяет критериям ");
            }
    }
}

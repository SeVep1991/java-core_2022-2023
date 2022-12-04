package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();

        int resultb = a % 5;
        System.out.println("При делений на 5 result = " + resultb);
        if (resultb == 2) {
            System.out.println("Удовлетворяет критериям при делений на 5");
        } else {
            System.out.println("Не удовлетворяет критериям при делений на 5");
        }
        int resultf = a % 7;
        System.out.println("При делений на 7 result = " + resultf);
        if (resultf == 1) {
            System.out.println("Удовлетворяет  критериям при делений на 7");
        } else {
            System.out.println("Не удовлетворяет критериям при делений на 7");
        }
    }
}

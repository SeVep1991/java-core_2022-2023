package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();

        int b = (a / 1000);
        System.out.println("В данном числе " + b + " тысяч(-я,-и)");
    }
}

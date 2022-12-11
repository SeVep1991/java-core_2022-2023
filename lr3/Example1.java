package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число дня недели: ");
        int a = in.nextInt();
        String s;

        switch (a)
        {
            case 1:
                s = "Понедельник";
                break;
            case 2:
                s = "Вторник";
                break;
            case 3:
                s = "Среда";
                break;
            case 4:
                s = "Четверг";
                break;
            case 5:
                s = "Пятница";
                break;
            case 6:
                s = "Суббота";
                break;
            case 7:
                s = "Воскресенье";
                break;
            default:
                s = "Введено некорректное значение";
        }
        System.out.printf(s);

    }
}

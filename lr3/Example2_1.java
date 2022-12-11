package lr3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String day = in.nextLine();

        int dayN = 0;
        if (day.equals("понедельник")) {
            dayN = 1;
        } else if (day.equals("вторник")) {
            dayN = 2;
        } else if (day.equals("среда")) {
            dayN = 3;
        } else if (day.equals("четверг")) {
            dayN = 4;
        } else if (day.equals("пятница")) {
            dayN = 5;
        } else if (day.equals("суббота")) {
            dayN = 6;
        } else if (day.equals("воскресенье")) {
            dayN = 7;
        } else {
            System.out.println("некорректное значение дня недели");
        }
        if (dayN != 0) {
            System.out.printf("это %s-й день недели\n", dayN);
        }
    }
}
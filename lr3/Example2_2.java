package lr3;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day = in.nextLine();

        switch (day) {
            case "понедельник":
                System.out.println("это 1-ый день недели");
                break;
            case "вторник":
                System.out.println("это 2-ой день недели");
                break;
            case "среда":
                System.out.println("это 3-ий день недели");
                break;
            case "четверг":
                System.out.println("это 4-ый день недели");
                break;
            case "пятница":
                System.out.println("это 5-ый день недели");
                break;
            case "суббота":
                System.out.println("это 6-ой день недели");
                break;
            case "воскресенье":
                System.out.println("это 7-ой день недели");
                break;
            default:
                System.out.println("некорректное значение дня недели");
                break;
        }
    }
}

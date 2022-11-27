package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input name: "); // Введите Имя
        String name = in.nextLine();

        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        System.out.println("Enter your year of birth: "); // Введите ваш год рождения
        int year = in.nextInt();
        int years = current_Year - year;

        System.out.printf("Name: " + name + " Age: " + years); // Имя: ... Лет: ...
        in.close();
    }
}

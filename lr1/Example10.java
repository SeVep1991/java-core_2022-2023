package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        System.out.println("Enter your year of birth: "); // Введите ваш год рождения
        int year = in.nextInt ();
        int years = current_Year - year;

        System.out.printf("You are " + years + " years old"); // вам ... лет
        in.close();
    }
}

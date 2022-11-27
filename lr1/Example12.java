package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        System.out.println("Enter how old are you: "); // Введите сколько вам лет
        int old = in.nextInt();
        int year = current_Year - old;

        System.out.printf("Your year of birth: " + year); // Ваш год рождения
        in.close();
    }
}

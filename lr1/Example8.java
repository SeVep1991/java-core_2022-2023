package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the current day of the week: "); //Введите название текущего дня недели
        String day = in.nextLine();

        System.out.println("Enter the name of the month: "); //Введите название месяца
        String month = in.nextLine();

        System.out.println("Enter the date (the number of the day in the month): "); //Введите дату (номер дня в месяце)
        int date = in.nextInt ();


        System.out.printf("The date: " + day + " " + date + " " + month); //Дата ...
        in.close();
    }
}
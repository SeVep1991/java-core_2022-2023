package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the month: "); // введите название месяца
        String month = in.nextLine();

        System.out.println("enter the number of days: "); // количество дней в месяце
        int days = in.nextInt ();

        System.out.printf("In " + month + " " + days + " days"); // в ... дней
        in.close();
    }
}

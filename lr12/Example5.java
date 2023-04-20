package lr12;

import java.util.List;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список" +
                " строк и возвращает новый список, содержащий только те строки," +
                " которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\n" + "Строка до:" + "\n");
        for(String i : strings){
            System.out.println(i);
        }

    Scanner in = new Scanner(System.in);
        System.out.println("Введите подстроку: ");
    String subString = in.nextLine();

    List<String> stringAfter = filter(strings, subString);

        System.out.println("\n" + "Строка после: " + "\n");
        for(String i : stringAfter){
        System.out.println(i);
    }
}
    public static List<String> filter(List<String> strings, String subString){
        return strings.stream().filter(i -> i.contains(subString)).toList();
    }

}
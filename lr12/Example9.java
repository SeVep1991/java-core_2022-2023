package lr12;

import java.util.List;

public class Example9{
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки," +
                " которые содержат только буквы (без цифр и символов).";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка до:" + "\n");
        for(String a : strings){
            System.out.println(a);
        }

        List<String> stringAfter = filter(strings);

        System.out.println("\n" + "Строка после:" + "\n");
        for(String a : stringAfter){
            System.out.println(a);
        }
    }

    public static List<String> filter(List<String> strings){
        return strings.stream().filter(a -> a.matches("[а-яА-Я]+")).toList();
    }
}
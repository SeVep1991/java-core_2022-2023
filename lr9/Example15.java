package lr9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
            try {

                int average = 0;
                int count = 0;

                Scanner in = new Scanner(System.in);
                System.out.print("Введите размер массива: ");
                int a = in.nextInt();
                int Array[] = new int[a];

                System.out.print("Введите значения: ");
                for (int i = 0; i < Array.length; i++) {
                    Array[i] = in.nextInt();
                    average = average + Array[i];
                    if (Array[i] > 0) {
                        count++;
                    }
                }

                int avg = average / count;
                System.out.println("Среднее значение: " + avg + ", Массив: " + Arrays.toString(Array));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Ошибка! Ввод строки, вместо числа.");
            }
            catch (InputMismatchException e) {
                System.err.println("Ошибка! Несоответствие числового типа данных");
            }
            catch (ArithmeticException e) {
                System.out.println("Ошибка! Арифметическая ошибкая: положительные элименты отсутствуют, деление на 0 и т.д.");
            }
        }
    }

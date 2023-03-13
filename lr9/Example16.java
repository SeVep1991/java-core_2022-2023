package lr9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Введите кол-во строк для матрицы: ");
            int sa = in.nextInt();
            System.out.print("Ввежите кол-во столбцов для матрицы: ");
            int sb = in.nextInt();

            int Array[] [] = new int[sa][sb];

            System.out.println("Матрица из случайных чисел: ");
            for (int i = 0; i < sa; i++){
                for(int j = 0; j < sb; j++){
                    Array[i][j] = random.nextInt(250);
                    System.out.print(Array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nУкажите номер столбца для вывода: ");
            int num = in.nextInt();
            System.out.println("\nСтолбец: ");
            for(int i = 0; i < sa; i++){
                System.out.println(Array[i][num-1]);
            }
        } catch (InputMismatchException a) {
            System.out.println("Ошибка! Несоответствие числового типа данных");
        } catch (ArrayIndexOutOfBoundsException b ){
            System.out.println("Ошибка! Несуществующий столбец");
        }
    }
}

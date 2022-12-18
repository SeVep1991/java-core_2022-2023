package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Random random = new Random(200);
        Scanner in = new Scanner(System.in);

        System.out.print("введите количество  столбцов массива: ");
        int a = in.nextInt();
        System.out.print("введите количество строк массива: ");
        int b = in.nextInt();

        int[][] firstArray = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = random.nextInt(100);
                System.out.println("i = " + i + "; j= " + j + "; value= " + firstArray[i][j]);
            }
        }
        System.out.println("удаление строки и столбеца: ");

        int deleteS = random.nextInt(a-1);
        int deleteK = random.nextInt(b-1);

        System.out.println("Cтолбец = " + (deleteS) + "; cтрока = " + (deleteK));
        System.out.println("результат удаления строки и столбеца:");

        int secondArray[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + "; j= " + j + "; value= " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int hvost = 0;
        int telo = 0;
        int h = 0;

        System.out.print("введите количество  столбцов массива: ");
        int a = in.nextInt();
        System.out.print("введите количество строк массива: ");
        int b = in.nextInt();

        int[][] c = new int[a][b];

        for (int i = 0; h < c.length ; h++) {
            for (int j = 0; j <(c [i].length - hvost); j++) {
                c[i][j] = telo;
                telo++;
            }
            if(i< c.length-1) {
                i++;}
            for (int o = a - 1; o > hvost; o--) {
                c [o][c [i].length -  1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < c.length; i++){
            int x = i+1;
            System.out.print("номер строки " + x + " : ");
            for (int j = 0; j < c [i].length; j++){
                System.out.print(c [i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}

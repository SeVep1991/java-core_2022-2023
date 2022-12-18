package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите высоту треугольника: ");
        int a = in.nextInt();

        int [][] c = new int [a][];

        for (int i=0;i< c.length;i++){
            int j = i+1;
            c [i]=new int[j];
        }

        int z = 0;
        for (int i =0; i < a; i++){
            for (int j = 0; j < i + 1; j++){
                c [i][j] = 2;
            }
        }
        for (int i = 0; i < a; i++){
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

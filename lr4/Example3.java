package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника: ");
        int a = in.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        int b = in.nextInt();

        int [][] c = new int [b][a];
        int z = 0;
        for (int i =0; i < b; i++){
            for (int j = 0; j <a; j++){
                c [i][j] = 2;
            }
        }
        for (int i = 0; i < b; i++){
            int x = i+1;
            System.out.print("номер строки " + x + " : ");
            for (int j = 0; j <a; j++){
                System.out.print(c [i][j]+ " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}

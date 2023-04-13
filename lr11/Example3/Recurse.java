package lr11.Example3;

import java.util.Random;

public class Recurse {

    private int size;
    private int[] Array;

    public Recurse(int size) {
        Array = new int[size];

        System.out.println("Ввод значений массива");
        Rec(size);
        System.out.println("Вывод значений массива");
        gRec(size);
    }

    public void Rec(int x) {
        Random random = new Random();

        int i = x - 1;
        if (x != 0) {
            Rec(x - 1);
            Array[i] = random.nextInt(20);
            System.out.print(Array[i] + ", ");
        }
    }

    public void gRec(int x) {
        int i = x - 1;

        if (x != 0) {
            gRec(x - 1);
            System.out.print(Array[i] + ", ");
        }
    }
}

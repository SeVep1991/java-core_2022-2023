package timus.task_1225;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long a[] = new long[46];

        a[1] = 2;
        a[2] = 2;
        for (int i = 3; i <= N; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        System.out.println(a[N]);

        sc.close();
    }

}

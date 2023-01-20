package timus.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int difference = Integer.MAX_VALUE;
        for (int c = 0; c < 1 << n; c++) {

            int heap1Weight = 0;
            int heap2Weight = 0;
            int k = c;

            for (int i = 0; i < n; i++) {
                if ((k & 1) > 0)
                    heap1Weight += a[i];
                else
                    heap2Weight += a[i];

                k >>= 1;
            }
            difference = Math.min(difference, Math.abs(heap1Weight - heap2Weight));
        }

        System.out.println(difference);
    }
}

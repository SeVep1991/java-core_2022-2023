package timus.task_1068;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = Math.abs(m);
        long sum = LongStream.range(1, n + 1).sum();
        if(m<0){
            sum-=1;
            sum*=-1;
        }else if (m == 0){
            sum = 1;
        }
        System.out.println(sum);
    }
}

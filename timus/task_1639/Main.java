package timus.task_1639;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n =  in.nextInt();

        int result = (m*n) % 2;

        if(result != 0) {
            System.out.println("[second]=:]");
        } else {
            System.out.println("[:=[first]");
        }
    }
}
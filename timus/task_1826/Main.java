package timus.task_1826;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int crew_count = input.nextInt();
        int next_teammate = 0;
        int min = 601;
        int overal_time = 0;
        for (int i = 0; i < crew_count; i++) {
            next_teammate = input.nextInt();
            if (next_teammate < min)
                min = next_teammate;
            overal_time += next_teammate;
        }
        overal_time -= min;
        System.out.println(overal_time);
    }
}
package lr11.Example7;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList Array = new LinkedList();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество человек: ");
        int n = in.nextInt();
        long m = System.currentTimeMillis();

        for(int i = 1; i <= n;i++){
            Array.add(i);
        }
        a(Array);
        for(int i = 0; i < Array.size();i++){
            System.out.println(Array.get(i) + "");
        }
        System.out.println((double) (System.currentTimeMillis() - m)/1000);
    }
    public static LinkedList a(LinkedList Array){

        if(Array.size() < 2){
            return Array;
        }
        for(int i = 0;i < Array.size();i++){
            if(i+1 < Array.size()) {
                Array.remove(i + 1);
            }
        }
        return a(Array);
    }
}

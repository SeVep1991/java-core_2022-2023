package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        for(int i = nums.length ; i >= 0 ; i--) {
            for (int a = 0; a < i-1; a++) {
                if (nums[a] < nums[a + 1]) {
                    int tmp = nums[a];
                    nums[a] = nums[a + 1];
                    nums[a + 1] = tmp;

                }
            }
        }
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки =" + nums[i]);
        }
    }
}
package lr6;

import java.util.Random;

public class Example8 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        int ArrayLength = 11;
        int intArray[] = new int[ArrayLength];
        for (int i = 0 ; i <ArrayLength; i++){
            intArray[i] = random.nextInt(1000);
            System.out.println("intArray["+i+"] = "+intArray[i]);
        }

        System.out.println("Среднее значение intArray["+ArrayLength+"] = "+Example.ArrayAvg(intArray));
    }
    protected static class Example{
        private static double ArrayAvg (int Array[]){
            int sum=0;
            for (int i = 0 ; i <Array.length; i++){
                sum += Array[i];
            }
            double result = (double)sum/Array.length;
            return result;
        }
    }
}

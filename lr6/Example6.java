package lr6;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {

        int [] arrayInt = new int[3];

        arrayInt [0] = 1;
        arrayInt [1] = 11;
        arrayInt [2] = 21;

        int [] arrayIntResult1 = Example6.getArray(arrayInt,1);
        System.out.println(Arrays.toString(arrayIntResult1));

        int [] arrayIntResult2 = Example6.getArray(arrayInt,11);
        System.out.println(Arrays.toString(arrayIntResult2));
    }

    public static int [] getArray(int [] arrayInt, int value) {
        if (value >= arrayInt.length) {
            return arrayInt;
        }


        int[] arrayIntResult = new int[value];
        for (int i = 0; 1 < value; i++) {
            arrayIntResult[1] = arrayInt[1];
        }
        return arrayIntResult;
    }
}

package lr6;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {

        int [] arrayInt = getMaxAndMinVolue (10,20,30,40,550);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] getMaxAndMinVolue(int... v){

    Arrays.sort(v);

    int [] arrayInt = new int[2];

    arrayInt [0] = v [0];
    arrayInt [1] = v [v.length - 1];
    return arrayInt;
    }
}

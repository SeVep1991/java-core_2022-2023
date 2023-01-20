package timus.task_1910;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/task_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bueferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        PrintWriter out = new PrintWriter(System.out);
        int size1 = Integer.parseInt(bueferedReader.readLine());
        String[] strings = bueferedReader.readLine().split(" ");
        int[] intsAfter = new int[size1-2];
        for (int i = 0; i < intsAfter.length; i++) {
            intsAfter[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i + 1]) +
                    Integer.parseInt(strings[i + 2]);
        }
        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);
        Arrays.sort(intsAfter);
        int firstValue = intsAfter[intsAfter.length -1];
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] == firstValue) {
                out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        out.flush();
    }
}

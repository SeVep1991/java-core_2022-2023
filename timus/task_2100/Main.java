package timus.task_2100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;

public class Main  {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshaAndLilly = 2;

        try {

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null){
                if (numberOfFriends == 0){
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberOfPairs++;
                }
            }

            int result;
            int guests = (marshaAndLilly + numberOfPairs + numberOfFriends);

            if (guests == 13) {
                result = (guests * 100) + 100;
            } else {
                result = (guests * 100);
            }

            System.out.println(result);
        }  catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}


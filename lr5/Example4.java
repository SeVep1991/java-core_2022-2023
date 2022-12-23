package lr5;

public class Example4 {

    public static void main(String[] args) {

        Example example1 = new Example(12, 'A');
        Example example2 = new Example(65.1267);
    }

    static class Example {

        private char ch1;
        private int int1;


        Example(int i, char c) {
            this.ch1 = c;
            this.int1 = i;
            int length = (int) (Math.log10(int1) + 1);
            double result = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + length + "\n");
        }

        Example(double d) {

            char ch1 = (char) d;

            int1 = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + ch1 + "; int = " + int1 + "\n");
        }
    }
}

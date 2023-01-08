package lr6;

public class Example5 {
    public static void main(String[] args) {
        int n = 6;
        int sq0 = (n*(n+1)*(2*n+1)/6);
        boolean test;
        System.out.println("Рекурсивный метод");
        int sq1 = squareSum.SquareSum1(n);
        test = sq1 == sq0;
        System.out.println("Вычисление cуммы квадратов числа "+"\""+n+"\""+" = "+sq1+" ("+test+")");
        System.out.println("\n Метод без рекурсии");
        int sq2 = squareSum.SquareSum2(n);
        test = sq2 == sq0;
        System.out.println("Вычисление cуммы квадратов числа "+"\""+n+"\""+" = "+sq2+" ("+test+")");
    }
    private static class squareSum {
        private static int SquareSum1(int n) {

            int result =0;
            System.out.println("*" + n);
            if (n <= 1) return 1;
            result += SquareSum1(n-1)+n*n;
            return result;
        }
        private static int SquareSum2(int n){

            int result=0;
            int j = n-1;
            double s = 1;
            for(int i=n; i>0;i--){
                System.out.println("*" + j);
                result = j*j + result;
                result = (int)Math.pow(j,s) + result;
                j--;
            }
            return result;
        }
    }
}
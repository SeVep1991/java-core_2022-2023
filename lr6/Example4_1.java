package lr6;

public class Example4_1 {
    public static void main(String[] args) {
        System.out.println(Fact1(6));
    }

    static int Fact1(int n) {
        int result = 1;
        for (int i = n % 2 == 0 ? 2 : 1; i <= n; i += 2)
            result *= i;

        return result;
    }
}
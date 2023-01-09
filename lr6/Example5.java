package lr6;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("цикл: ");
        System.out.println(a(10));
        System.out.println("рекурсия: ");
        System.out.println(b(10));
    }
    static int a(int n)
    {
        int result = 0;
        for (int i = 1; i <= n; i++)
            result += (int)(Math.pow(i, 2));
        return result;
    }
    static int b(int n)
    {
        if (n <= 1)
            return n;
        else
            return b(n - 1) + n * n;
    }
}
package lr6;

public class Example2 {
    private static int val1;

    public static void view() {
        System.out.println(val1);
        val1++;

    }

    public static void main(String[] args) {
        Example2 myex = new Example2();
        myex.view();
        myex.view();
        myex.view();
        myex.view();

    }
}
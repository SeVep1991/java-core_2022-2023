package lr5;

public class Example5 {

    public static void main(String[] args) {

        Example example = new Example(21);
        System.out.println("Число = " + example.PrintInt());


        example.Set(15);
        System.out.println("Число = " + example.PrintInt());


        example.Set(125);
        System.out.println("Число = " + example.PrintInt());


        example.Set(-15);
        System.out.println("Число = " + example.PrintInt());


        example.Set();
        System.out.println("Число = " + example.PrintInt());
    }

    static class Example {

        private int int1;

        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;

            if (n >= 100) {
                int1 = 100;
            }

            if (n <= 0) {
                int1 = 0;
            }
        }

        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }

        public int PrintInt() {
            return int1;
        }

        Example(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}

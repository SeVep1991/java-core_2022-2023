package lr6;

public class Example3{
    public static void main(String[] args) {

        int[] A = { 1, 3, 5, 7, 15, 8 };
        int Mn=0;
        int Mx=0;

        double Avg =0;

        MyClass.Method1(Mn, Mx, Avg, A);
    }
    class MyClass
    {

        static public void Method1(  int mn,  int mx, double avg, int[] a)
        {
         
            int sum = 0;
            mx = a[0];
            mn = a[0];
            for (int k=0; k < a.length; k++) {
                sum += a[k];
                if (a[k] > mx) mx = a[k];
                if (a[k] < mn) mn = a[k];
            }
            avg = (double)sum / a.length;
            System.out.println("Минимальное значение: "+ mn);
            System.out.println("Максимальное значение: "+ mx);
            System.out.println("Среднее значение: "+ avg);
        }
    }
}

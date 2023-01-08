package lr6;

public class Example4_1 {
    static int Factorial(int n){
    int result = 1;
    for (int i = 1; i <=n; i++ ){
        result = result*i++;
    }
    return result;
}

        public static void main(String[] args){
            System.out.println(Factorial(5));
        }
}





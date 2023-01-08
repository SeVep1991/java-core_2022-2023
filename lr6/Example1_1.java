package lr6;

public class Example1_1 {

    public static void main(String[] args) {
        Example1 Example1 = new Example1();

        Example1.setCh10Str1 ('l');
        Example1.setCh10Str1 ("Привет!");

        System.out.println(Example1.ch1);
        System.out.println(Example1.str1);

        char [] chars1 = new char [5];
        chars1 [0] = 'п';
        chars1 [1] = 'о';
        chars1 [2] = 'к';
        chars1 [3] = 'а';
        chars1 [4] = '!';

        Example1.setCh10Str1 (chars1);
        System.out.println(Example1.str1);

        char [] chars2 = new char [1];
        chars2 [0] = 'ц';

        Example1.setCh10Str1 (chars2);
        System.out.println(Example1.ch1);
    }
}

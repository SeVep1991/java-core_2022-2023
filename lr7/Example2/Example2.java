package lr7.Example2;

public class Example2 {

    public static void main(String[] args) {

        superClassTest Test0 = new superClassTest();
        System.out.println(Test0.toString());

        superClassTest Test1 = new superClassTest("Проверка");
        System.out.println(Test1.toString());

        superClassTest Test2 = new subClassTest();
        System.out.println(Test2.toString());

        superClassTest Test3 = new subClassTest("Тестирование длинны");
        System.out.println(Test3.toString());

        superClassTest Test4 = new subClassTest(765);
        System.out.println(Test4.toString());

        superClassTest Test5 = new subClassTest("текст ", 1991);
        System.out.println(Test5.toString());
    }
}

package lr7.Example5;

public class Example5 {
    public static void main(String[] args) {

        superClass superClass = new superClass("Тест superClass");
        superClass.PrintString();

        subClass subClass = new subClass ("Тест subclass", 1991);
        subClass.PrintString();

        subsubClass subsubClass = new subsubClass("Тест subsubclass", 'A');
        subsubClass.PrintString();

        superClass superClassOutsubclass = new superClass(subClass.getStr1());
        superClassOutsubclass.PrintString();

        superClass superClassOutsubsubclass = new superClass(subsubClass.str1);
        superClassOutsubsubclass.PrintString();
    }
}

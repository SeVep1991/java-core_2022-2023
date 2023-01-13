package lr7.Example3;

public class Example3 {

    public static void main(String[] args) {

        superClassTest Test1 = new superClassTest(15);
        System.out.println (Test1.toString());

        subClassTest Test2 = new subClassTest(35, 'A');
        System.out.println (Test2.toString());

        subSubClassTeset Test3 = new subSubClassTeset(56,'B',"Test");
        System.out.println (Test3.toString());

    }

}


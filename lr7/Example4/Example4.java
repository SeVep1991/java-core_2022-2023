package lr7.Example4;

public class Example4 {
    public void main(String[] args) {

        superClassTest superClass = new superClassTest('A');
        System.out.println(superClass.toString());
        System.out.println("________________________________________\n");

        superClassTest superClassCopy = new superClassTest(superClass);
        System.out.println("Копия: " + "\n" + superClassCopy.toString());
        System.out.println("________________________________________\n");

        subClassTest subClass = new subClassTest('B', "Привт!");
        System.out.println(subClass.toString());
        System.out.println("________________________________________\n");

        subClassTest subClassCopy = new subClassTest(subClass);
        System.out.println("Копия: " + "\n" + subClassCopy.toString());
        System.out.println("________________________________________\n");

        subsubClassTest subsubClass = new subsubClassTest('C', "Hello!", 1991);
        System.out.println(subsubClass.toString());
        System.out.println("________________________________________\n");


        subsubClassTest subsubClassCopy = new subsubClassTest(subsubClass);
        System.out.println("Копия: " + "\n" + subsubClassCopy.toString());
        System.out.println("________________________________________\n");

    }
}


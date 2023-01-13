package lr7.Example3;
public class subSubClassTeset extends subClassTest {
    public String str2;

    public subSubClassTeset(int int2,char num1,String num2) {
        super(int2,num1);
        this.str2 = num2;

    }

    @Override
    public String toString() {
        return "subSubClassTeset" +
                "str1: " + ch1 + '\'' +
                ",str2: '" + str2 + '\'' +
                ",int1:" + int1;
    }

}

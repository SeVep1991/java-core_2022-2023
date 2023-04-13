package lr11.Example4;

public class Example {
    public static void main(String[] args) {

        Example4 node0 = new Example4(0, null);
        Example4 node1 = new Example4(1, null);
        Example4 node2 = new Example4(2, null);
        Example4 node3 = new Example4(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Example4 ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

class Example4 {
    public int value;
    public Example4 next;

    Example4(int value, Example4 next) {
        this.value = value;
        this.next = next;
    }
}

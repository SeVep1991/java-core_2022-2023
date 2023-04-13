package lr11.Example5;

class Example21 {
    public static void main(String[] args) {
        Example22 head = null;
        for (int i = 10; i >= 0; i--)
        {
            head = new Example22(i, head);
        }
        Example22 ref = head;
        System.out.print("Формирование односвязного списка от хвоста: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next; }
    }
}

class Example22 {
    public int value; public Example22 next;
    Example22(int value, Example22 next)
    {
        this.value = value; this.next = next;
    }
}

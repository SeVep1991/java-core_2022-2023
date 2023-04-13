package lr11.Example5;

class Example11 {
    public static void main(String[] args) {
    Example12 head = new Example12(0, null);
    Example12 tail = head;
    for (int i = 0; i < 10; i++) {
        tail.next = new Example12(i + 1, null);
        tail = tail.next;
    }
    Example12 ref = head;
    System.out.println("Формирование односвязного списка от головы: ");
    while (ref != null) {
        System.out.print(" " + ref.value);
        ref = ref.next;
    }
}
}

class Example12 {
    public int value;
    public Example12 next;

    Example12(int value, Example12 next) {
        this.value = value;
        this.next = next;
    }
}

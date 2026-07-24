package LinkedLists.Single;

public class LL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAt(int pos, int value) throws IndexOutOfBoundsException {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (pos == 0) {
            insertFirst(value);
            return;
        }
        if (pos == this.size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        temp.next = new Node(value, temp.next);
        this.size++;
    }

    public void insertFirst(int value) {
        Node node = new Node(value, head);
        this.head = node;
        if (tail == null) {
            tail = head;
        }
        this.size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value, null);
        tail.next = node;
        this.tail = node;
        this.size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

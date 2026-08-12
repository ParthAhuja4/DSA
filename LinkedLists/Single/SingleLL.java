package LinkedLists.Single;

public class SingleLL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public SingleLL() {
        this.size = 0;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertAt(int index, int value) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == this.size) {
            insertLast(value);
            return;
        }

        Node prev = this.get(index - 1);

        prev.next = new Node(value, prev.next);
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

    public void deleteFirst() {
        this.head = head.next;
        if (head == null) {
            this.tail = null;
        }
        this.size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node scndLast = this.get(size - 2);
        this.tail = scndLast;
        scndLast.next = null;
        this.size--;
    }

    public void deleteAt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node prev = this.get(index - 1);
        Node toDltNode = prev.next;
        prev.next = toDltNode.next;
        toDltNode.next = null;
        this.size--;
    }

    public void reverse() {
        if (this.head == null) {
            throw new IndexOutOfBoundsException("Empty LL");
        }
        if (this.size == 1) {
            return;
        }
        Node currNode = this.head;
        Node prevNode = null;
        Node oldHead = this.head;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode; // beep
            prevNode = currNode;
            currNode = nextNode;
        }
        this.tail = oldHead;
        this.head = prevNode;
    }

}
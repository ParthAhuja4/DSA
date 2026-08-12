package LinkedLists.Doubly;

public class DoublyLL {

    private class Node {
        int value;
        Node next;
        Node prev;

        // public Node(int value) {
        // this.value = value;
        // this.next = null;
        // this.prev = null;
        // }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    public Node get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if (index < size / 2) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            Node temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " <=> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAt(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == this.size) {
            insertLast(value);
            return;
        }
        Node prevNode = this.get(index - 1);
        Node newNode = new Node(value, prevNode.next, prevNode);
        prevNode.next = newNode;
        newNode.next.prev = newNode;
        this.size++;

    }

    public void insertLast(int value) {
        if (this.tail == null) {
            insertFirst(value);
            return;
        }

        Node newNode = new Node(value, null, this.tail);
        this.tail.next = newNode;
        this.tail = newNode;
        this.size++;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value, this.head, null);

        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.head.prev = newNode;
            this.head = newNode;
        }

        this.size++;
    }

    public void deleteLast() {
        if (this.size <= 1) {
            deleteFirst();
            return;
        }
        Node oldTail = this.tail;
        this.tail = oldTail.prev;
        this.tail.next = null;
        oldTail.prev = null;
        this.size--;
    }

    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node toDltNode = this.get(index);
        Node leftNode = toDltNode.prev;
        Node rightNode = toDltNode.next;

        leftNode.next = rightNode;
        rightNode.prev = leftNode;
        toDltNode.next = null;
        toDltNode.prev = null;

        this.size--;
    }

    public void deleteFirst() {
        if (this.head == null) {
            return; // list is empty, nothing to do
        }

        Node oldHead = this.head;
        this.head = oldHead.next;

        if (this.head != null) {
            this.head.prev = null;
        } else {
            this.tail = null; // list is now empty
        }

        oldHead.next = null; // help GC, avoid stray references
        this.size--; // if you track size
    }

    public void reverse() {
        if (this.head == null) {
            throw new IndexOutOfBoundsException("Empty LL");
        }
        if (this.size == 1) {
            return;
        }

        Node currNode = this.head;
        Node oldHead = this.head;
        Node oldTail = this.tail;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = currNode.prev;// beep
            currNode.prev = nextNode;
            currNode = nextNode;
        }

        this.head = oldTail;
        this.tail = oldHead;
    }

}

package LinkedLists.Single;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(9);
        linkedList.insertFirst(7);
        linkedList.insertFirst(5);
        linkedList.insertLast(11);
        linkedList.insertAt(2, -1);
        linkedList.display();
    }
}

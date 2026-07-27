package LinkedLists.Single;

public class Main {
    public static void main(String[] args) {
        SingleLL linkedList = new SingleLL();
        linkedList.insertFirst(9);
        linkedList.insertFirst(7);
        linkedList.insertFirst(5);
        linkedList.insertLast(11);
        linkedList.insertAt(2, -1);
        linkedList.display();
        linkedList.deleteFirst();
        linkedList.deleteAt(1);
        linkedList.display();
        linkedList.deleteLast();
        linkedList.display();
        System.out.println(linkedList.get(1));
        linkedList.reverse();
        linkedList.display();
    }
}

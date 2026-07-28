package LinkedLists.Doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        // ---- Insertions ----
        dll.insertFirst(2); // [2]
        dll.insertFirst(1); // [1, 2]
        dll.insertFirst(0); // [0, 1, 2]
        dll.insertLast(3); // [0, 1, 2, 3]
        dll.insertAt(4, 2); // [0, 1, 4, 2, 3]
        dll.insertAt(99, 1); // [0, 99, 1, 4, 2, 3]

        System.out.println("After insertions:");
        dll.display();

        // ---- get() ----
        System.out.println("\nElement at index 0: " + dll.get(0));
        System.out.println("Element at index 3: " + dll.get(3));
        System.out.println("Element at last index: " + dll.get(5));

        // ---- reverse() ----
        dll.reverse();
        System.out.println("\nAfter reverse:");
        dll.display();

        // reverse back so subsequent deletes are easier to follow
        dll.reverse();
        System.out.println("\nAfter reversing back:");
        dll.display();

        // ---- deleteFirst() ----
        dll.deleteFirst();
        System.out.println("\nAfter deleteFirst:");
        dll.display();

        // ---- deleteLast() ----
        dll.deleteLast();
        System.out.println("\nAfter deleteLast:");
        dll.display();

        // ---- deleteAt() ----
        dll.deleteAt(1);
        System.out.println("\nAfter deleteAt(1):");
        dll.display();

        // ---- reverse() again on smaller list ----
        dll.reverse();
        System.out.println("\nAfter reverse again:");
        dll.display();

        // ---- drain the list completely ----
        System.out.println("\nDraining list with deleteFirst:");
        while (true) {
            try {
                System.out.println("Removing: " + dll.get(0));
                dll.deleteFirst();
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        dll.display(); // should just print "END"

        // ---- edge case: operations on empty list ----
        dll.deleteFirst(); // no-op, list already empty
        dll.deleteLast(); // internally calls deleteFirst, still safe
        dll.display();

        // ---- rebuild and test insertAt at boundaries ----
        dll.insertAt(10, 0); // insert into empty list at index 0
        dll.insertAt(20, 1); // insert at end
        dll.insertAt(15, 1); // insert in middle
        System.out.println("\nRebuilt list:");
        dll.display();

        // ---- test exception handling ----
        try {
            dll.get(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nCaught expected exception for get(100): " + e);
        }

        try {
            dll.insertAt(50, -1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception for insertAt(-1): " + e);
        }

        try {
            dll.deleteAt(50);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception for deleteAt(50): " + e);
        }
    }
}
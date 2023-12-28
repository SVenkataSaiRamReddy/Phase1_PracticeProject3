// Using Node Class From LinkedList class I created
public class SortedCircularLinkedList {
    Node head;

    SortedCircularLinkedList() {
        head = null;
    }

    void sortedInsert(int newData) {
        Node newNode = new Node(newData);
        Node current = head;

        if (current == null) {
            newNode.next = newNode;
            head = newNode;
        } else if (current.data >= newNode.data) {
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            while (current.next != head && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void printList() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedCircularLinkedList sortedCircularList = new SortedCircularLinkedList();

        sortedCircularList.sortedInsert(3);
        sortedCircularList.sortedInsert(7);
        sortedCircularList.sortedInsert(5);
        sortedCircularList.sortedInsert(9);
        sortedCircularList.sortedInsert(4);

        System.out.println("Sorted Circular Linked List after insertion:");
        sortedCircularList.printList();
    }
}

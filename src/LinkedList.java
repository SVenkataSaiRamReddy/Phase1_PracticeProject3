class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Key not found in the list");
            return;
        }

        prev.next = temp.next;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(1);
        linkedList.insert(3);

        System.out.println("Linked list before deletion:");
        linkedList.printList();

        int keyToDelete = 1;
        linkedList.deleteNode(keyToDelete);

        System.out.println("Linked list after deleting first occurrence of " + keyToDelete + ":");
        linkedList.printList();
    }
}

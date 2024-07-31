public class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    LinkedList(Node newNode) {
        this.head = newNode;
        this.tail = newNode;
    }

    void printList() {
        Node currentNode = this.head;

        while(currentNode!= null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}
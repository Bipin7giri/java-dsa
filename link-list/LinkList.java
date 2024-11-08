class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkList {
    Node head;

    LinkList() {
        this.head = null;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void 

    int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    void log() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        System.out.println("Size of list: " + list.size());
        list.log();
    }
}

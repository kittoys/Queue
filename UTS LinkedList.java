public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void viewList() {
        if (head == null) {
            System.out.println("LinkedList kosong");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Menambahkan data ke linked list
        linkedList.addNode(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(40);

        // Melihat isi linked list
        linkedList.viewList();
    }
}

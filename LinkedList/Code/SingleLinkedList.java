public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    SingleLinkedList() {
        this.size = 0;
    }

    public void insertAtBegin(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertATLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            tail = newNode;
        }
        size ++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertAtBegin(value);
            return;
        }
        if (index == size) {
            insertATLast(value);
            return;
        }
        Node newnode = new Node(value);
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        newnode.next = curr.next;
        curr.next = newnode;

        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public static Node deleteATIndex(Node head, int position)
    {
        Node temp = head;
        Node prev = null;

        // Base case if linked list is empty
        if (temp == null)
            return head;

        // Case 1: Head is to be deleted
        if (position == 1) {
            head = temp.next;
            return head;
        }

        // Case 2: Node to be deleted is in middle
        // Traverse till given position
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        // If given position is found, delete node
        if (temp != null) {
            prev.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }

        return head;
    }


    public void find(int value){
        Node node=head;
        while (node != null){
            if (node.value == value){
                System.out.println("Found node with value: " + value);
                return;
            }
            node = node.next;
        }
        System.out.println("Not found node with value: " + value);
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("END");
    }


    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.insertAtBegin(5);

        list.insertAtBegin(4);
        list.insertAtBegin(3);
        list.insertAtBegin(2);
        list.insertATLast(44);
//        list.insert(11, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
//        list.deleteATIndex(2);
        list.display();
        list.find(22);
        list.display();


    }
}

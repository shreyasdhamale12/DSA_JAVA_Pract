public class DoubleLinkedList {

    class Node{
        int value;
        Node prev;
        Node next;

        Node(int value){
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoubleLinkedList(){
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public void insertAtBegin(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAfterValue(int value,int newValue){
        Node current = head;

        while (current.next != null && current.value != value){
            current = current.next;
        }
        if (current == null){
            System.out.println(value + "not found");
        }

        Node newNode = new Node(newValue);
        newNode.next = current.next;
        newNode.prev = current;


        if (current.next != null){
            current.next.prev = newNode;
        }else {
            tail = newNode;
        }
        current.next = newNode;
        size++;
    }

    public void displayStart(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayEnd(){
        Node node = tail;

        while (node != null){
            System.out.print(node.value + "->");
            node = node.prev;
        }
        System.out.println("Start");
    }



    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.insertAtBegin(5);
        list.insertAtBegin(4);
        list.insertAtBegin(3);
        list.insertAtBegin(2);
        list.insertAtEnd(11);
        list.insertAtEnd(12);
        list.insertAtEnd(13);
        list.insertAtEnd(14);
        list.insertAfterValue(11,33);
        list.displayStart();
        list.displayEnd();

    }
}

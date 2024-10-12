public class CIrcularLinkedList {

    private Node head;
    private Node tail;

    CIrcularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        int value;
        Node next;
        int size;

        Node(int value){
            this.value = value;
            this.next = null;
            size = 0;
        }
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void deleteAValue(int value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete");
            return;
        }

        Node temp = head;
        Node prev = null;

        //Node to be deleted is head
        if (head.value == value) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            System.out.println("Deleted value " + value);
            return;
        }



        //Value to be deleted is in middle or end
        do {
            prev = temp;
            temp = temp.next;

            if (temp.value == value){
                prev.next = temp.next;
                if (temp == tail){
                    tail = prev;
                }
                System.out.println("Deleted value " + value);
                return;
            }
        }while (temp != head);
        System.out.println("Value not found " + value);
    }

    public void  display(){
        Node temp = head;

        do{
            System.out.print(temp.value + " ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("END");
    }


    public static void main(String[] args) {

        CIrcularLinkedList list = new CIrcularLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.deleteAValue(2);
        list.display();
    }
}

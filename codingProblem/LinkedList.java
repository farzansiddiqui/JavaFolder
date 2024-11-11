public class LinkedList {
    Node head;

    public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.insetAtFront(6);
    linkedList.insetAtFront(5);
    linkedList.insetAtFront(4);
    linkedList.insetAtFront(3);
    linkedList.insetAtFront(2);
    linkedList.insetAtFront(1);

    System.out.println("After inserting nodes at their front: ");
    linkedList.printList();

    
    }
        void insetAtFront(int new_data){
            Node node = new Node();
            node.data = new_data;
            node.next = head;
            head = node;

        }
        void printList(){
            Node node = head;
            while (node != null) {
                System.out.print(node.data+" ");
                node = node.next;
            }
            System.out.println();
        }

    class Node {
        int data;
        Node next;
    }
}

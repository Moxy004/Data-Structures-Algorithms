package linkedListProblems.p1;

public class LinkedList {
    Node head;

    // CREATE
    public void add(int id, String name, double grade){
        Node newNode = new Node(id, name, grade);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // READ
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println("ID: " + temp.id +
                    ", Name: " + temp.name +
                    ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    //
}

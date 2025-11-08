package linkedListProblems.p1;

public class Node {
    int id;
    String name;
    double grade;
    Node next;

    Node(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.next = null;
    }
}

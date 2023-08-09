package LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        list.insertLast(60);
        list.insertLast(70);

        list.insertAtIndex(80,3);
        list.insertAtIndex(90,4);

        list.display();

        list.deleteFirst();

        list.display();
    }
}

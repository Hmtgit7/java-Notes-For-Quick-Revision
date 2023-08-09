package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertFirst(value);
        }
        if (index == size) {
            insertLast(value);
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(value, currentNode.next);
            currentNode.next = newNode;
            size++;
        }
    }

    /*
     * Delete the first node of the linked list
     */
    public void deleteFirst() {
        if (head == null) {
            tail = null;
        }
        if(head==null && tail==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    void deleteLast(){
        if(head==null && tail==null){
            System.out.println("List is Empty");
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        Node currentNode=head;
        while(currentNode.next!=tail){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }   

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

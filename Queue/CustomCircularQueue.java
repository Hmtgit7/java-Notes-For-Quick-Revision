package Queue;

public class CustomCircularQueue {
    protected int queue[];
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size=0;

    public CustomCircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomCircularQueue(int size) {
        this.queue = new int[size];
    }

    public Boolean isFull() {
        return size == queue.length;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        queue[end]=item;
        end=end%queue.length;

        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed=queue[front++];
        front=front%queue.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return queue[front];
    }   

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(queue[i] + " -> ");
            i++;
            i %= queue.length;
        } while (i != end);
        System.out.println("END");
    }
}

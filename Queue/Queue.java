package Queue;

public class Queue {
    protected int queue[];
    private static final int DEFAULT_SIZE = 10;
    int end=-1;

    public Queue() {
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        queue=new int[size];
    }

    public Boolean isEmpty(){
        return end == -1;
    }
    public Boolean isFull(){
        return end==queue.length-1;
    }

}

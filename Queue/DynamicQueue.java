package Queue;

public class DynamicQueue extends CustomCircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[queue.length * 2];

            // copy all previous items in new queue
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[(front + i) % queue.length];
            }
            front = 0;
            end = queue.length;
            queue = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }
}

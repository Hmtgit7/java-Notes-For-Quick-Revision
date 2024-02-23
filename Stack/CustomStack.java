package Stack;

public class CustomStack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
    int pointer=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.stack = new int[size];
    }
    public Boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        pointer++;
        stack[pointer] = value;
        return true;
    }
    public Boolean isFull(){
        return pointer == stack.length-1;
    }
    public Boolean isEmpty(){
        return pointer == -1;
    }
    public int pop() throws CustomException{
        if(isEmpty()){
            throw new CustomException("Stack is Empty");
        }
        return stack[pointer--];
    }
    public int peek() throws CustomException{
        if(isEmpty()){
            throw new CustomException("Stack is Empty");
        }
        return stack[pointer];
    }

}

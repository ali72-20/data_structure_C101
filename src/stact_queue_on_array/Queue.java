package stact_queue_on_array;

public class Queue {
    private int front;
    private int[] queue;
    private int cap;
    private int currentEmptyPosition;

    public Queue(){
        currentEmptyPosition = 0;
        front = -1;
        queue = new int[1];
        cap = 1;
    }
    public boolean isEmpty(){
        return front == -1;
    }

    public int getSize(){
        return  currentEmptyPosition;
    }

    public int front(){
        if(isEmpty()){
            throw new RuntimeException("stact_queue_on_array.Queue is empty");
        }
        return queue[front];
    }

    /**
     * pop is dequeue operation
     */
    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("stact_queue_on_array.Queue is empty");
        }
        front++;
        if(front == currentEmptyPosition){
            front = -1;
            currentEmptyPosition = 0;
        }
    }

    private void dynamicAlloc(){
        cap*= 2;
        int[] newQueue = new int[cap];
        for(int i = 0;i < getSize();++i){
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }
    public void push(int data){
        if(isEmpty()){
            queue[currentEmptyPosition] = data;
            front = currentEmptyPosition;
            currentEmptyPosition++;
            return;
        }
        if(getSize() == cap){
            dynamicAlloc();
        }
        queue[currentEmptyPosition] = data;
        currentEmptyPosition++;
    }

}

package Queue_in_linked_list;


public class QueueList<E>{
    private QueueNode<E> front;
    private int size;

    public QueueList(){
        front = null;
        size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }
    public int getSize(){
        return size;
    }
    public E front(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }
    private void updateSize(int update){
        size+= update;
    }
    public void push(E data){
        QueueNode<E> newNode = new QueueNode<>(data);
        updateSize(1);
        if (isEmpty()){
            front = newNode;
            return;
        }
        QueueNode<E> current = front;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        updateSize(-1);
        front = front.next;
        System.gc();
    }
}

package stack_on_linked_list;

public class StackList<E>{
    private StackNode<E> top;
    private int size;

    public StackList(){
        size = 0;
        top = null;
    }
    private void updateSize(int update){
        size+= update;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int getSize(){
        return size;
    }
    public E peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }
    public void push(E data){
        updateSize(1);
        StackNode<E> newNode = new StackNode<>(data);
        if (isEmpty()) {
            top = newNode;
            return;
        }
        newNode.prev = top;
        top = newNode;
    }
    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }
        updateSize(-1);
        StackNode<E> deletedNode = top;
        top = top.prev;
        deletedNode = null;
        System.gc();
    }
}

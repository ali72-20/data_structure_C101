package stact_queue_on_array;

public class Stack {
    private int top;
    private int[] stack;
    private int cap;
    public Stack(){
        top = -1;
        cap = 1;
        stack = new int[1];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int getSize(){
        return top + 1;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return stack[top];
    }

    private void dynamicAlloc(){
        cap*=2;
        int[] newStack = new int[cap];
        for(int i = 0;i < getSize(); ++i){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    public void push(int data){
        if(getSize() == cap){
            dynamicAlloc();
        }
        top++;
        stack[top] = data;
    }
    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        top--;
    }
}

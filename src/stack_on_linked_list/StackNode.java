package stack_on_linked_list;

public class StackNode<E> {
    E data;
    StackNode<E> prev;
    StackNode(E data){
         this.data = data;
         prev = null;
    }
}

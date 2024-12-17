package Queue_in_linked_list;

public class QueueNode<E>{
    E data;
    QueueNode<E> next;

    QueueNode(E data){
        this.data = data;
        next = null;
    }
}

import Queue_in_linked_list.QueueList;
import linked_list.SList;
import stack_on_linked_list.StackList;

public class Main {
    public static void main(String[] args) {
        QueueList<Integer> queue = new QueueList<>();
        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
        queue.push(10);
        queue.push(30);
        queue.push(50);
        queue.push(100);
        System.out.println(queue.getSize());
        System.out.println(queue.front());
        while (!queue.isEmpty()){
            System.out.print(queue.front() + " ");
            queue.pop();
        }
    }
}
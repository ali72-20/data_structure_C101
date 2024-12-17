import linked_list.SList;
import stack_on_linked_list.StackList;

public class Main {
    public static void main(String[] args) {
        StackList<Integer> stack = new StackList<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
        stack.push(10);
        System.out.println(stack.peek());
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        while (!stack.isEmpty()){
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
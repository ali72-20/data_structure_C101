import linked_list.SList;

public class Main {
    public static void main(String[] args) {
        SList list = new SList();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.insertBack(10);
        list.insertBack(12);
        list.insertBack(11);
        System.out.println(list.getHead());
        list.print();
        list.insertBack(13);
        list.print();
        list.insertFront(17);
        list.print();
        System.out.println(list.getSize());
        list.removeFront();
        list.print();
        System.out.println(list.getSize());
        list.removeBack();
        list.print();
        System.out.println(list.getSize());
        list.insertInPosition(90,0);
        list.print();
        list.insertInPosition(100,4);
        list.print();
        list.insertInPosition(30,2);
        list.print();
        list.insertInPosition(2,30);
    }
}
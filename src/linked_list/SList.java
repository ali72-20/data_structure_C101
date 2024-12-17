package linked_list;

public class SList {
    Node head;
    int size;

    public SList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    private void updateSize(int update){
        size+= update;
    }

    public int getHead(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }

    public void insertBack(int data){
        Node newNode = new Node(data);
        updateSize(1);
        if(isEmpty()){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertFront(int data){
        Node newNode = new Node(data);
        updateSize(1);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next  = head;
        head = newNode;
    }
    public void insertInPosition(int data, int pos){
        if(pos > getSize()){
            throw new IndexOutOfBoundsException("Out of bound");
        }
        if(pos < 0){
            throw new IndexOutOfBoundsException("Out of bound");
        }
        if(pos == 0){
            insertFront(data);
            return;
        }
        if(pos == getSize()){
            insertBack(data);
            return;
        }
        Node newNode = new Node(data);
        updateSize(1);
        Node current = head;
        int currentPosition = 0;
        while (currentPosition + 1 < pos){
            currentPosition++;
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void removeInPosition(int pos){
        if(pos >= getSize()){
            throw new IndexOutOfBoundsException("Out of bound");
        }
        if (pos < 0) {
            throw new IndexOutOfBoundsException("Out if bound");
        }
        if(pos == 0){
            removeFront();
            return;
        }
        if(pos == getSize() - 1){
            removeBack();
            return;
        }
        updateSize(-1);
        int currentPosition = 0;
        Node currentNode = head;
        while (currentPosition + 1 < pos){
            currentPosition++;
            currentNode = currentNode.next;
        }
        Node deletedNode = currentNode.next;
        currentNode.next = currentNode.next.next;
        deletedNode = null;
        System.gc();
    }
    public void removeFront(){
        if(isEmpty()){
            throw new RuntimeException("list is empty");
        }
        updateSize(-1);
        head = head.next;
        System.gc();
    }
    public void updateInPosition(int newData, int pos){
        if(pos >= getSize()){
            throw new IndexOutOfBoundsException("Out of bound");
        }
        if (pos < -1) {
            throw new IndexOutOfBoundsException("Out of bound");
        }
        int currentPosition = 0;
        Node currentNode = head;
        while (currentPosition < pos){
            currentPosition++;
            currentNode = currentNode.next;
        }
        currentNode.data = newData;
    }
    public void removeBack(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }
        updateSize(-1);
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void print(){
        if(isEmpty()){
            return;
        }
        Node current = head;
        while (current.next != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }
}

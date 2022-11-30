package stackqueue;

import arraylist.MyLinkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
//    this.tail.next đc truyền vào sẽ biến thành this.tail để nếu truyền thêm thì nó sẽ là đuôi để xét
    }
    public Node dequeue(){
        if (this.head ==  null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
//        chèn thg phía sau lên thg đầu
        if (this.head == null){
            this.tail = null;
        }
        return temp;
    }
    class Node {
        public int key;
        public Node next;
        public Node(int key){
            this.key = key;
            this.next = null;
        }
    }
}

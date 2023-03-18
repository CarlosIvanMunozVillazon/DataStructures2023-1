package DataStructures;

public class Node {

    private int data;
    private Node next;

    public Node (int key){
        this.data = key;
        this.next = null;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return this.next;
    }
}

package DataStructures;

public class DoubleNode {

    private int data;
    private DoubleNode next;
    private DoubleNode previous;
    public DoubleNode (int key){
        this.data = key;
        this.next = null;
        this.previous = null;
    }

    public void setNext(DoubleNode nextNode) {
        this.next = nextNode;
    }

    public void setPrevious(DoubleNode previousNode){this.previous = previousNode;};
    public int getData() {
        return this.data;
    };

    public DoubleNode getNext() {
        return this.next;
    }
    public DoubleNode getPrevious() {
        return this.previous;
    }

}

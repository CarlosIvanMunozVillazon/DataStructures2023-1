package DataStructures;

public class DoubleNodeStrings {

    private String data;
    private DoubleNodeStrings next;
    private DoubleNodeStrings previous;
    public DoubleNodeStrings (String key){
        this.data = key;
        this.next = null;
        this.previous = null;
    }

    public void setNext(DoubleNodeStrings nextNode) {
        this.next = nextNode;
    }

    public void setPrevious(DoubleNodeStrings previousNode){this.previous = previousNode;};
    public String getData() {
        return this.data;
    };

    public DoubleNodeStrings getNext() {
        return this.next;
    }
    public DoubleNodeStrings getPrevious() {
        return this.previous;
    }
}

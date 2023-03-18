package DataStructures;

public class LinkedListWithTail {

    private Node head;
    private Node tail;

    public LinkedListWithTail(){
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printLinkedListWithTail(){
        if(isEmpty()){
            System.out.println("The linked list with tail is empty.");
        }else{
            Node headRef = this.head;
            while(headRef != null){
                System.out.print(headRef.getData() + " ");
                headRef = headRef.getNext();
            }
        }
    }

    // UNCODE print
//    public void printLinkedListWithTail(){
//        if(isEmpty()){
//            System.out.println("The linked list with tail is empty.");
//        }else{
//            DataStructures.Node headRef = this.head;
//            while(headRef.getNext() != null){
//                System.out.print(headRef.getData() + " ");
//                headRef = headRef.getNext();
//
//            }
//            System.out.print(headRef.getData());
//
//        }
//    }


    public boolean isEmpty(){
        return this.head == null;
    }

    public void pushFront(Node newNode){
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public int topFront(){
        if(isEmpty()){
//            System.out.println("The list is empty.");
            return 0;
        }else{
            return this.head.getData();
        }
    }

    public void popFront(){
        if(isEmpty()){
//            System.out.println("The list is empty.");
        }else{
            this.head = this.head.getNext();
        }
    }

    public void pushBack(Node newNode){
        if(isEmpty()){
            this.tail = newNode;
            this.head = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public int topBack(){
        if(isEmpty()){
            System.out.println("The list is empty.");
            return 0;
        }else{
            return this.tail.getData();
        }
    }

    public void popBack(){
        if(isEmpty()){
            System.out.println("The list is empty.");
        }else{
            Node headRef = this.head;
            while(headRef.getNext() != this.tail){
                headRef = headRef.getNext();
            }
            headRef.setNext(null);
            this.tail = headRef;
        }
    }

    public boolean find(int searchedKey){
        if(isEmpty()){
            return false;
        }else{
            Node headReference = this.head;
            while(headReference.getNext() != null && headReference.getData() != searchedKey){
                headReference = headReference.getNext();
            }
            return headReference.getData() == searchedKey;
        }
    }

    public void erase(int hatedKey){
        if(isEmpty()){
            System.out.println("The list is empty.");
        }
    }

    public int dequeue(){
        popFront();
        return topFront();
    }

}

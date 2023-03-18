package DataStructures;

import java.util.Objects;

public class DoublyLinkedListStrings {

    private DoubleNodeStrings head;
    private DoubleNodeStrings tail;

    public DoublyLinkedListStrings (){
        this.head = null;
        this.tail = null;
    }

    public void regularPrintLinkedList(){
        DoubleNodeStrings reference = this.head;
        while(reference != null){
            System.out.print(reference.getData() + " ");
            reference = reference.getNext();
        }
        System.out.println();

    }

    public void reversePrintLinkedList(){
        DoubleNodeStrings reference = this.tail;
        while(reference != null){
            System.out.print(reference.getData() + " ");
            reference = reference.getPrevious();
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void pushFront(DoubleNodeStrings newNode){
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public String topFront(){
        if(isEmpty()){
            return " ";
        }else{
            return this.head.getData();
        }
    }

    public void popFront(){
        if(isEmpty()){
            System.out.println("The doubly linked list is empty.");
        }else if (this.head == this.tail){
            this.head = this.head.getNext();
            this.tail = this.tail.getPrevious();
        }else{
            this.head = this.head.getNext();
            this.head.setPrevious(null);
        }
    }

    public void pushBack(DoubleNodeStrings newNode){
        if(isEmpty()){
            this.tail = newNode;
            this.head = newNode;
        }else{
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
        }
    }

    public String topBack(){
        if(isEmpty()){
            System.out.println("The doubly linked list is empty.");
            return " ";
        }else{
            return this.tail.getData();
        }
    }

    public void popBack(){
        if(isEmpty()){
            System.out.println("The doubly linked list is empty.");
        }else if (this.head == this.tail){
            this.head = null;
            this.tail = null;
        }else {
            this.tail = this.tail.getPrevious();
            this.tail.setNext(null);
        }
    }

    public boolean find(String searchedKey){
        DoubleNodeStrings ref = this.head;
        if(isEmpty()){
            return false;
        }
        while(ref.getNext() != null && !ref.getNext().getData().equals(searchedKey)){
            ref = ref.getNext();
        }
        return ref.getNext().getData().equals(searchedKey);

    }

    public void pop(String hatedKey){
        if(isEmpty()){
            System.out.println("The double linked list is empty.");
        } else {
            DoubleNodeStrings ref = this.head;
            while(ref.getNext() != null && !ref.getNext().getData().equals(hatedKey)){
                ref = ref.getNext();
            }
            try{
                if(ref.getNext() != null && ref.getNext().getData().equals(hatedKey)){
                    ref.getNext().getNext().setPrevious(ref);
                    ref.setNext(ref.getNext().getNext());
                }
            }catch(NullPointerException e){
                if(this.tail.getData().equals(hatedKey)){
                    popBack();
                }
            }

        }
    }

    public DoubleNodeStrings specialPop(){
        DoubleNodeStrings returnNode = this.head;
        returnNode.setNext(null);
        popFront();
        return returnNode;
    }

    public DoubleNodeStrings getHead() {
        return head;
    }

    public void setHead(DoubleNodeStrings head) {
        this.head = head;
    }

    public DoubleNodeStrings getTail() {
        return tail;
    }

    public void setTail(DoubleNodeStrings tail) {
        this.tail = tail;
    }

}

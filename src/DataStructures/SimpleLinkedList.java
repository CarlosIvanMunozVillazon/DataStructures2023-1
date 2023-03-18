package DataStructures;

public class SimpleLinkedList {

    private Node head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public void printLinkedList(){
        Node headReference = this.head;
        while(headReference.getNext() != null){
            System.out.print(headReference.getData() + " ");
            headReference = headReference.getNext();
        }
        System.out.print(headReference.getData() + "\n");
    }

    public void pushFront(Node newNode){
        if (isEmtpy()){
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public int topFront(){
        if(isEmtpy()){
            System.out.println("The linked list is empty.");
            return 0;
        }else{
            return this.head.getData();
        }
    }

    public void popFront(){
        if(isEmtpy()){
            System.out.println("The linked list is empty.");
        } else {
            this.head = this.head.getNext();
        }
    }

    public void pushBack(Node newNode){
        if(isEmtpy()){
            this.head = newNode;
        }else{
            Node headReference = this.head;
            while(headReference.getNext() != null){
                headReference = headReference.getNext();
            }
            headReference.setNext(newNode);
        }
    }

    public int topBack(){
        if(isEmtpy()){
            System.out.println("The list is empty.");
            return 0;
        }else{
            Node headReference = this.head;
            while(headReference.getNext() != null){
                headReference = headReference.getNext();
            }
            return headReference.getData();
        }
    }

    public void popBack(){
        if (isEmtpy()){
            System.out.println("The list is empty");
        }else{
            Node headReference = this.head;
            while(headReference.getNext().getNext() != null){
                headReference = headReference.getNext();
            }
            headReference.setNext(null);
        }
    }

    public boolean isEmtpy(){
        return this.head == null;
    }

    public boolean find(int searchedKey){
        if(isEmtpy()){
            return false;
        }else {
            Node headReference = this.head;
            while(headReference.getNext() != null && searchedKey != headReference.getData()){
                headReference = headReference.getNext();
            }
            System.out.println("Hello there obi wan.");
            return headReference.getData() == searchedKey;
        }
    }

    public void erase(int hatedKey){
        if(topBack() == hatedKey){
            popBack();
        } else if (topFront() == hatedKey){
            popFront();
        } else if (isEmtpy() || !find(hatedKey)){
            System.out.println("The list is empty or the element is not here");
        } else {
            Node headReference = this.head;
            while(headReference.getNext().getData() != hatedKey){
                headReference = headReference.getNext();
            }
            headReference.setNext(headReference.getNext().getNext());
        }
    }

    public void addBefore(Node newNode, int referenceKey) {
        if(!find(referenceKey)){
            System.out.println("Pendejo");
        }else if(topFront() == referenceKey){
            pushFront(newNode);
        }else{
            Node headReference = this.head;
            while (headReference.getNext().getData() != referenceKey) {
                headReference = headReference.getNext();
            }
            newNode.setNext(headReference.getNext());
            headReference.setNext(newNode);
        }
    }

    public void addAfter(Node newNode, int referenceKey) {
        if(!find(referenceKey)){
            System.out.println("Pendejo");
        }else{
            Node headReference = this.head;
            while (headReference.getData() != referenceKey) {
                headReference = headReference.getNext();
            }
            newNode.setNext(headReference.getNext());
            headReference.setNext(newNode);
        }
    }
}

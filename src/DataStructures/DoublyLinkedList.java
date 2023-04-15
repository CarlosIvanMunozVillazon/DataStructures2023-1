package DataStructures;

public class DoublyLinkedList {

    private DoubleNode head;
    private DoubleNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void regularPrintLinkedList() {
        DoubleNode reference = this.head;
        while (reference != null) {
            System.out.print(reference.getData() + " ");
            reference = reference.getNext();
        }
        System.out.println();

    }

    public void reversePrintLinkedList() {
        DoubleNode reference = this.tail;
        while (reference != null) {
            System.out.print(reference.getData() + " ");
            reference = reference.getPrevious();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void pushFront(DoubleNode newNode) {
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public int topFront() {
        if (isEmpty()) {
            return 0;
        } else {
            return this.head.getData();
        }
    }

    public void popFront() {
        if (isEmpty()) {
            System.out.println("The doubly linked list is empty.");
        } else if (this.head == this.tail) {
            this.head = this.head.getNext();
            this.tail = this.tail.getPrevious();
        } else {
            this.head = this.head.getNext();
            this.head.setPrevious(null);
        }
    }

    public void pushBack(DoubleNode newNode) {
        if (isEmpty()) {
            this.tail = newNode;
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
        }
    }

    public int topBack() {
        if (isEmpty()) {
            System.out.println("The doubly linked list is empty.");
            return 0;
        } else {
            return this.tail.getData();
        }
    }

    public void popBack() {
        if (isEmpty()) {
            System.out.println("The doubly linked list is empty.");
        } else if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.getPrevious();
            this.tail.setNext(null);
        }
    }

    public boolean find(int searchedKey) {
        if (isEmpty()) {
            return false;
        }

        DoubleNode ref = this.head;

        while (ref.getNext() != null && ref.getData() != searchedKey) {
            ref = ref.getNext();
        }

        return ref.getData() == searchedKey;
    }

    public void pop(int hatedKey) {
        if (isEmpty()) {
            System.out.println("The double linked list is empty.");
        } else {
            DoubleNode ref = this.head;
            while (ref.getNext() != null && ref.getNext().getData() != hatedKey) {
                ref = ref.getNext();
            }
            try {
                if (ref.getNext() != null && ref.getNext().getData() == hatedKey) {
                    ref.getNext().getNext().setPrevious(ref);
                    ref.setNext(ref.getNext().getNext());
                }
            } catch (NullPointerException e) {
                if (this.tail.getData() == hatedKey) {
                    popBack();
                }
            }

        }
    }

    public DoubleNode specialPop() {
        DoubleNode returnNode = this.head;
        returnNode.setNext(null);
        popFront();
        return returnNode;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }
}

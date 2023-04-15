package DataStructures;

public class Testing {
    public static void main(String[] args) {

//TESTING FOR EXAM 1 : DATA STRUCTURES

        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        DoubleNode n4 = new DoubleNode(4);

        DoublyLinkedList myList = new DoublyLinkedList();

        myList.pushBack(n1);
        myList.pushBack(n2);
        myList.pushBack(n3);
        myList.pushBack(n4);

        System.out.println(myList.find(6));
//DOUBLY LINKED LIST WITH STRINGS

//        DoubleNodeStrings n1 = new DoubleNodeStrings("William");
//        DoubleNodeStrings n2 = new DoubleNodeStrings("Roger");
//        DoubleNodeStrings n3 = new DoubleNodeStrings("Anderson");
//
//        DoublyLinkedListStrings proof = new DoublyLinkedListStrings();
//
//        proof.pushBack(n1);
//
//        proof.regularPrintLinkedList();
//
//        proof.pushBack(n2);
//
//        proof.regularPrintLinkedList();
//
//        proof.pushFront(n3);
//
//        proof.regularPrintLinkedList();


//        String name = "James";
//        String name2 = "Valery";
//
//        System.out.println(name2.equals(name));
/*
        DoubleNode n1 = new DoubleNode(2);
        DoubleNode n2 = new DoubleNode(3);
        DoubleNode n3 = new DoubleNode(4);

        DoublyLinkedList myList = new DoublyLinkedList();

        myList.pushFront(n1);
        myList.pushFront(n2);
        myList.pushFront(n3);

        DoubleNode n4 = new DoubleNode(5);
        DoubleNode n5 = new DoubleNode(6);

        myList.pushBack(n4);
        myList.pushBack(n5);

        myList.regularPrintLinkedList();

        myList.popBack();
        myList.regularPrintLinkedList();

        myList.pop(4);
        myList.regularPrintLinkedList();
*/

//        Scanner scanner = new Scanner(System.in);
//        String linea = scanner.nextLine();
//        String [] numeros = linea.split(" ") ;
//
//        DataStructures.LinkedListWithTail positive = new DataStructures.LinkedListWithTail();
//        DataStructures.LinkedListWithTail negative = new DataStructures.LinkedListWithTail();
//
//        for(String numero : numeros){
//            int number = Integer.parseInt(numero);
//            DataStructures.Node n = new DataStructures.Node(number);
//
//            if (number != 0){
//                if(number < 0){
//                    negative.pushBack(n);
//                } else {
//                    positive.pushFront(n);
//                }
//            }
//        }
//
//        positive.printLinkedListWithTail();
//        negative.printLinkedListWithTail();


//DOUBLY LINKED LIST:


// LINKED LIST WITH TAIL:
/*

        DataStructures.Node n1 = new DataStructures.Node(1);
        DataStructures.Node n2 = new DataStructures.Node(2);
        DataStructures.Node n3 = new DataStructures.Node(3);
        DataStructures.Node n4 = new DataStructures.Node(4);

        myGreatList.pushFront(n1);
        myGreatList.pushFront(n2);
        myGreatList.pushFront(n3);
        myGreatList.pushFront(n4);

        myGreatList.printLinkedListWithTail();
        System.out.println(myGreatList.topFront());

        myGreatList.popFront();
        myGreatList.printLinkedListWithTail();

        DataStructures.Node n5 = new DataStructures.Node(5);
        myGreatList.pushBack(n5);

        myGreatList.printLinkedListWithTail();
        System.out.println(myGreatList.topBack());

        myGreatList.popBack();
        myGreatList.printLinkedListWithTail();
*/


// SIMPLE LINKED LIST
//        DataStructures.SimpleLinkedList myLinkedList = new DataStructures.SimpleLinkedList();
//
//        DataStructures.Node n1 = new DataStructures.Node(1);
//        DataStructures.Node n2 = new DataStructures.Node(2);
//        DataStructures.Node n3 = new DataStructures.Node(3);
//        DataStructures.Node n4 = new DataStructures.Node(4);
//
//        myLinkedList.pushFront(n1);
//        myLinkedList.pushFront(n2);
//        myLinkedList.pushFront(n3);
//        myLinkedList.pushFront(n4);
//
//        myLinkedList.printLinkedList();
//        myLinkedList.popFront();
//
//        myLinkedList.printLinkedList();
//        DataStructures.Node n5 = new DataStructures.Node(0);
//        myLinkedList.pushBack(n5);
//
//        myLinkedList.printLinkedList();

//        System.out.println(myLinkedList.topFront());
//        System.out.println(myLinkedList.topBack());
//        myLinkedList.popBack();
//        myLinkedList.printLinkedList();
//
//        System.out.println(myLinkedList.find(3));
//        myLinkedList.erase(2);
//
//        myLinkedList.printLinkedList();
//
//        DataStructures.Node addBeforeNode = new DataStructures.Node(9);
//        myLinkedList.addBefore(addBeforeNode,3);
//
//        myLinkedList.printLinkedList();
//
//        DataStructures.Node n6 = new DataStructures.Node(6);
//        DataStructures.Node n7 = new DataStructures.Node(7);
//        DataStructures.Node n8 = new DataStructures.Node(8);
//
//        myLinkedList.pushFront(n6);
//        myLinkedList.pushFront(n7);
//        myLinkedList.pushFront(n8);
//
//        myLinkedList.printLinkedList();
//
//        DataStructures.Node extraNode = new DataStructures.Node(9);
//        myLinkedList.addBefore(extraNode,1);
//
//        myLinkedList.printLinkedList();
//
//        DataStructures.Node kk = new DataStructures.Node(98);
//        myLinkedList.addAfter(kk,8);
//        myLinkedList.printLinkedList();


//        STATIC ARRAYS:
//        DataStructures.StaticArrayList proof = new DataStructures.StaticArrayList(5);
//        proof.pushBack(1);
//        proof.pushBack(2);
//        proof.pushBack(3);
//        proof.pushBack(4);
//        proof.pushBack(5);

//        System.out.println(proof.getSize());
//        proof.printArray();
//
//        proof.pushFront(9);
//        proof.pushFront(8);
//        proof.pushFront(7);
//        proof.printArray();
//
//        proof.popFront();
//        proof.printArray();
//        proof.popFront();
//        proof.printArray();
//        System.out.println();
//
//        proof.pushFront(8);
//
//        System.out.println();
//
//        proof.printArray();
//
//        System.out.println();
//
//        System.out.println(proof.topFront());
//
//        System.out.println();
//
//        proof.popFront();
//
//        proof.printArray();
//
//        proof.popBack();
//
//        System.out.println();
//
//        proof.printArray();

        //Programar popBack(), delete()
    }

}

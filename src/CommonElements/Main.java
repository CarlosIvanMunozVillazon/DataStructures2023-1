package CommonElements;

import DataStructures.DoubleNode;
import DataStructures.DoublyLinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String [] numbers1 = line1.split(" ");

        String line2 = scanner.nextLine();
        String [] numbers2 = line2.split(" ");

        DoublyLinkedList list1 = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();

        for(String number1: numbers1){
            int number = Integer.parseInt(number1);
            DoubleNode n = new DoubleNode(number);
            list1.pushBack(n);
        }

        for(String number2: numbers2){
            int number = Integer.parseInt(number2);
            DoubleNode n = new DoubleNode(number);
            list2.pushFront(n);
        }

        scanner.close();

        DoublyLinkedList list3 = new DoublyLinkedList();
        DoublyLinkedList list4 = new DoublyLinkedList();

        while((!list1.isEmpty()) && !(list2.isEmpty())){
            if(list1.topFront() != list2.topFront()){
                DoubleNode n1 = new DoubleNode(list1.topFront());
                DoubleNode n2 = new DoubleNode(list2.topFront());
                list3.pushBack(n1);
                list4.pushBack(n2);
            }
            list1.popFront();
            list2.popFront();
        }

        list3.regularPrintLinkedList();
        System.out.println();
        list4.reversePrintLinkedList();

    }
}

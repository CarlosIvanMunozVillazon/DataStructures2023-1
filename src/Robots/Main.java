package Robots;

import DataStructures.LinkedListWithTail;
import DataStructures.Node;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linea = scanner.nextLine();
        String [] numeros = linea.split(" ") ;

        LinkedListWithTail positive = new LinkedListWithTail();
        LinkedListWithTail negative = new LinkedListWithTail();

        for(String numero : numeros){
            int number = Integer.parseInt(numero);
            Node n = new Node(number);

            if (number != 0){
                if(number < 0){
                    negative.pushBack(n);
                } else {
                    positive.pushFront(n);
                }
            }
        }


        boolean isNotReady = true;
        while (isNotReady){
            while((!negative.isEmpty()) && positive.topFront() >= (negative.topFront() * -1)){
                if (positive.topFront() == (negative.topFront() * -1)){
                    positive.popFront();
                    negative.popFront();
                } else {
                    negative.popFront();
                }
            }
            while((!positive.isEmpty()) && positive.topFront() <= (negative.topFront() * -1)){
                if (positive.topFront() == (negative.topFront() * -1)){
                    positive.popFront();
                    negative.popFront();
                } else {
                    positive.popFront();
                }
            }

            if(positive.isEmpty() && negative.isEmpty()){
                System.out.println("No hay robots!");
                isNotReady = false;
            } else if (positive.isEmpty()){
                negative.printLinkedListWithTail();
                isNotReady = false;
            } else if (negative.isEmpty()){
                reverseLinkedListWithTail(positive).printLinkedListWithTail();
                isNotReady = false;
            }
        }

    }

    public static LinkedListWithTail reverseLinkedListWithTail(LinkedListWithTail entry){
        LinkedListWithTail reversedLinkedListWithTail = new LinkedListWithTail();
        while(!entry.isEmpty()){
            Node n = new Node(entry.topFront());
            reversedLinkedListWithTail.pushFront(n);
            entry.popFront();
        }

        return reversedLinkedListWithTail;
    }
}

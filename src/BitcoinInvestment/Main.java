package BitcoinInvestment;

import DataStructures.DoubleNode;
import DataStructures.DoublyLinkedList;
import DataStructures.LinkedListWithTail;
import DataStructures.Node;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] stringPrices = line.split(" ");
        LinkedListWithTail integerPrices = new LinkedListWithTail();

        for(String prices : stringPrices){
            int priceNumber = Integer.parseInt(prices);
            Node n = new Node(priceNumber);
            integerPrices.pushBack(n);
        }

        LinkedListWithTail results = new LinkedListWithTail();

        Node ref = integerPrices.getHead();

        while(ref.getNext() != null){
            Node ref2 = ref.getNext(); int jumps = 1;
            while(ref2 != null && ref.getData() >= ref2.getData()){
                jumps++;
                ref2 = ref2.getNext();
            }

            Node n;
            if(ref2 == null){
                n = new Node(0);
            } else {
                n = new Node(jumps);
            }
            results.pushBack(n);
            ref = ref.getNext();
        }

        Node n = new Node(0);
        results.pushBack(n);

        scanner.close();

        results.printLinkedListWithTail();

    }
}

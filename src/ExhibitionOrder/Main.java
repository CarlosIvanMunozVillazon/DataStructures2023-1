package ExhibitionOrder;
import DataStructures.DoubleNodeStrings;
import DataStructures.DoublyLinkedListStrings;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] names = line.split(" ");

        DoublyLinkedListStrings exhibitionNames = new DoublyLinkedListStrings();
        int numberOfNames = names.length;

        if(numberOfNames % 2 == 0){
            for(int i = 0; i <= (numberOfNames / 2) - 1; i++){
                int k = (numberOfNames - 1) - i;
                DoubleNodeStrings n1 = new DoubleNodeStrings(names[i]);
                DoubleNodeStrings n2 = new DoubleNodeStrings(names[k]);
                exhibitionNames.pushBack(n1);
                exhibitionNames.pushBack(n2);
            }
        } else {
            for(int i = 0; i <= (numberOfNames / 2) - 1; i++){
                int k = (numberOfNames - 1) - i;
                DoubleNodeStrings n1 = new DoubleNodeStrings(names[i]);
                DoubleNodeStrings n2 = new DoubleNodeStrings(names[k]);
                exhibitionNames.pushBack(n1);
                exhibitionNames.pushBack(n2);
            }
            DoubleNodeStrings n3 = new DoubleNodeStrings(names[names.length/2]);
            exhibitionNames.pushBack(n3);
        }

        scanner.close();

        exhibitionNames.regularPrintLinkedList();

    }
}

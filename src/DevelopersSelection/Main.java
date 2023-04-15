package DevelopersSelection;

import DataStructures.DoubleNode;
import DataStructures.DoublyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numberOfSkills = scanner.nextLine();
        String [] kkk = numberOfSkills.split(" ");
        int numberOfSkills1 = Integer.parseInt(kkk[0]);

        String enumSkills = scanner.nextLine();
        String[] enumSkills1 = enumSkills.split(" ");

        String numberOfApplicants = scanner.nextLine();
        int numberOfApplicants1 = Integer.parseInt(numberOfApplicants);

        DoublyLinkedList enumeratedSkills = new DoublyLinkedList();

        for (String enumSkill : enumSkills1) {
            int skill = Integer.parseInt(enumSkill);
            DoubleNode n = new DoubleNode(skill);
            enumeratedSkills.pushBack(n);
        }

        int counter = 0;

        for (int i = 0; i < numberOfApplicants1; i++) {
            String applicantSkills = scanner.nextLine();
            String[] applicantSkills1 = applicantSkills.split(" ");

            DoublyLinkedList skillsPerApplicant = new DoublyLinkedList();

            for (String skill : applicantSkills1) {
                int skill1 = Integer.parseInt(skill);
                DoubleNode n = new DoubleNode(skill1);
                skillsPerApplicant.pushBack(n);
            }

            int length = 0;

            DoubleNode ref = enumeratedSkills.getHead();
            for (int k = 0; k < numberOfSkills1; k++){

                if (ref != null && skillsPerApplicant.find(ref.getData())){
                    ref = ref.getNext();
                    length++;
                }
            }

            if (length == numberOfSkills1) {
                counter++;
            }
        }
        scanner.close();
        System.out.print(counter);
    }
}

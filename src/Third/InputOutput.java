package Third;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

//        //o sa incepem prin a adauga informatii de la consola
//
        Scanner scanner = new Scanner(System.in);
//        //aici este input
//        System.out.println("Care este numele tau?");
//        String name = scanner.nextLine();
//        //aici este output
//        System.out.println("Salut, " + name);

        //o sa mai facem un exemplu mai complicat putin

        System.out.println("Pot sa adaug doua sau trei valori de la consola: ");
        System.out.println("Care este numele tau? ");
        String firstValue = scanner.nextLine();
        System.out.println("Care este prenumele tau?");
        String secondValue = scanner.nextLine();
        System.out.println("Salut " + firstValue + secondValue +
                ", bine ai venit la tutorialul de java.");
    }
}

package Third;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        //exemplu de if

        Scanner s = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int points = s.nextInt();

        if (points < 100) {
            System.out.println("Ai Castigat");
        } else if (points > 100){
            System.out.println("Mai Incearca");
        } else {
            System.out.println("Remiza");
        }

    }
}

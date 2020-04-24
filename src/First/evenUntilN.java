package First;

import java.util.Scanner;

public class evenUntilN {
    public static void main(String[] args) {

        // Scrieti nr pare pana la un nr finit N

        //folosim scanner pentru a citi un nr de la consola
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrieti un nr: ");
        int n = scan.nextInt();
        int i = 0;

        while (i <= n) {
            // i % 2 inseamna i impartit la 2 rest 0
            // == testeaza egalitatea
            if ( i % 2 == 0) {
                System.out.print(i + " ");
                // folosim i + " " pentru a adauga un spatiu dupa fiecare afisare
            }
            //i++ pentru a lua if -ul de la capat pentru o noua afisare
            i++;
        }

    }
}

package Second;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);

        int n = s.nextInt();
        boolean isPrime = true;
        int i = 2;

        while (i <= n/2 && isPrime == true ) {
            if (n % i == 0) {
               // isPrime == false; // este mereu false , de asta nu mai trebuie sa scriem
                System.out.println("Gasit divizor " + i);
            }
            i++;
        }
        System.out.println(isPrime);

    }
}

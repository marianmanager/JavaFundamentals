package Second;

import java.util.Scanner;

public class PrimeNumbers2 {

    //facem o metoda numita isPrime pentru a verifica daca un numar este prim

    public static boolean isprime(int n) {
        boolean nIsPrime = true;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                nIsPrime = false;
            }
            i++;
        }
        return nIsPrime;
    }

    public static void main(String[] args) {

        int a = 655;
        int b = 3435;
        int c = 345678;

        boolean aIsPrime = isprime(a);
        boolean bIsPrime = isprime(b);
        boolean cIsPrime = isprime(c);

        System.out.println(aIsPrime);
        System.out.println(bIsPrime);
        System.out.println(cIsPrime);

        Scanner s = new Scanner(System.in);
        System.out.println("Scrieti un nr N: ");
        int n = s.nextInt();

        //Un mic exercitiu
        //afisam numerele prime pana la n

        System.out.println("Primes until N ");
        int i = 2;
        while (i <= n) {
            boolean iIsPrime = isprime(i);
            if (iIsPrime == true) {
                System.out.println(i + " ");
            }
            i++;
        }
        //Sa printam o linie de spatiu in consola
        System.out.println();

        //un al doilea exercitiu
        //afisam primele n numere prime

        System.out.println("First n primes");
        i = 2;
        int counter = 0;
        while (counter <= n) {
            boolean iIsPrime = isprime(i);
            if (iIsPrime == true) {
                System.out.println(i + " ");
                counter++;
            }
            i++;
        }
    }
}
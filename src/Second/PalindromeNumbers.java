package Second;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int m = n;
        //nr * -- is where I build the reverse number
        int nr = 0;
        while ( n != 0) {

            int r = n % 10;
            n = n / 10;
            nr = nr * 10 + r;
        }

        if (nr == m) {
            System.out.println("Numarul este palindrom!!");
        } else {
            System.out.println("Numarul nu este palindrom..");
        }
    }
}

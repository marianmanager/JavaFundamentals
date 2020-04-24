package First;

import java.util.Scanner;

public class greatestCommonNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valoare pentru a: ");
        int a = scan.nextInt();
        System.out.println("Valoare pentru b: ");
        int b = scan.nextInt();

        // a != b inseamna a diferit de b
        while (a != b ) {
            System.out.println(a);
            System.out.println(b);

            if (a > b) {
                // a minus b
                a = a-b;
            } else {
                //b minus a
                b = b-a;
            }
        }

        System.out.println(a);
    }
}

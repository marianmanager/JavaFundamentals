package First;

public class secondLearn {
    public static void main(String[] args) {

        //max of 2 numbers
        int a = 5;
        int b = 7;
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        System.out.println("-------------------");

        //max of 3 numbers

        int c = 9;
        int d = 13;
        int f = 24; //este cel mai mare

        System.out.println("Varianta 1");
        //varianta 1

        if (c > d) {
            if (c > f) {
                System.out.println(c);
            } else {
                System.out.println(f);
            }
        } else {
            if (d > f) {
                System.out.println(d);
            } else {
                System.out.println(f);
            }
        }

        //Varianta 2
        System.out.println("Varianta 2");

        int max2;

        if (c > d) {
            max2 = c;
        } else {
            max2 = d;
        }

        if (max2 > f) {
            System.out.println(max2);
        } else {
            System.out.println(f);
        }
    }
}

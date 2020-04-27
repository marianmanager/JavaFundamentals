package Castings;

public class Castings {
    public static void main(String[] args) {

        byte b1 = 17;
        short s1 = 342;
        int i1 = 12432;
        long l1 = 2436657336583L;

        int i2 = (int)b1;
        System.out.println(i2);

        long l2 = (long) i1;
        System.out.println(l2);

        int sum = 23;
        double average1 = sum / 2;
        System.out.println(average1);

        double average2 = (double) (sum / 2);
        System.out.println(average2);

        double average3 = (double) sum /2;
        System.out.println(average3);

        int i3 = (int)average3;
        System.out.println(i3);

        int i4 = 12;
        byte b2 = (byte)i4;
        System.out.println(b2);
        System.out.println(Byte.MAX_VALUE);
        i4 = 128;
        b2 = (byte)i4; //incepe de la inceput de la 127 de fiecare data
                        // un byte  -127 la +127
        System.out.println(b2);
        i4 = 256;
        b2 = (byte)i4;
        System.out.println(b2);

        //ASCII code   a are codul ASCII 97
        // A are codul ascii 65
        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) 'b');
        System.out.println((int) 'B');
        System.out.println((int) 'c');
        System.out.println((int) 'D');
        System.out.println((int) 'd');
        System.out.println((int) 'F');

        //codul Ascii nr 65 are litera A
        // 66 are litera B
        System.out.println((char)65);
        System.out.println((char)66);
        System.out.println((char)67);
        System.out.println((char)68);
        System.out.println((char)69);

        double d1 = (double) i4;
        System.out.println(d1);

        //sa punem codul si pe GIT

    }
}

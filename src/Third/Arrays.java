package Third;

public class Arrays {

    public static void main(String[] args) {
        //Va voi arata trei exemple simple in care voi folosi arrays
        int [] arrayOfInts = new int[5];
        //initierea

        arrayOfInts[0]=10;
        arrayOfInts[1]=15;
        arrayOfInts[2]=20;
        arrayOfInts[3]=25;
        arrayOfInts[4]=30;

        //cu un fori simplificat itineram arrayul
        for (int valoare: arrayOfInts) {
            System.out.println(valoare);
        }


        //exemplul 2
        String [] arrayOfStrings = new String[2];
        //initierea

        System.out.println();
        arrayOfStrings[0] = "Invatam";
        arrayOfStrings[1] = "Java";

        //apelam si itineram cu un for simplificat din nou

        for(String s: arrayOfStrings) {
            System.out.println(s);
        }
        System.out.println();

        //si un ultim exercitiu

        int[] arrayOfInts2 = {50,55,60,65,70};
        System.out.println(arrayOfInts2[0]); //prints 50
        System.out.println(arrayOfInts2[1]); //prints 55
        System.out.println(arrayOfInts2[2]); //prints 60
        System.out.println();

        //prints 50,55,60,65,70
        //fori normal
        for (int i = 0; i < arrayOfInts2.length; i++) {
            System.out.println(arrayOfInts2[i]);
        }
        System.out.println(); //merge la linia urmatoare

        //prints 50,55,60,65,70
        //fori simplificat
        for(int i : arrayOfInts2) {
            System.out.println(i + " ");
        }

    }
}

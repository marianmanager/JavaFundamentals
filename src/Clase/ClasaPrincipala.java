package Clase;

public class ClasaPrincipala {
    public static void main(String[] args) {

        Integer x = Integer.valueOf(5);
        int y = 0;

        System.out.println(x.toString() + " tare");
        System.out.println(y);

        String a = new String ("abc");
        String b = a.substring(0,1);
        System.out.println(a + " vs. " + b);

        ClasaMea ob1 = new ClasaMea();

        ob1.x = 10;
        ob1.a = "Marian ";

        System.out.println(ob1.numeleMeu(ob1.a) + " numarul este " + ob1.x);

    }
}

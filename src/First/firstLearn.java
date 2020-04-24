package First;

public class firstLearn {

    public static void main(String[] args) {

        int numarIncrementat = increment(23);
        int numarDecrementat = decrement(23);

        System.out.println(numarIncrementat);
        System.out.println("--------------");
        System.out.println(numarDecrementat);
        System.out.println("--------------");

        int pozitie = pozitiaInSir("Alexandru");
        System.out.println(pozitie);
        System.out.println("--------------");

        int pozitie2 = pozitiaInSir("Matei");
        System.out.println(pozitie2);
        System.out.println("--------------");

        int pozitie3 = pozitieCaracter("Invatam Java",'a');
        System.out.println(pozitie3);
        System.out.println("--------------");

        char caracterGasit = literaInSir("Invatam Java",5);
        System.out.println(caracterGasit);
        System.out.println("--------------");

    }

    public static int increment (int numar) {
        return ++numar;
    }
    public static int decrement (int numar) {
        return --numar;
    }

    public static int pozitiaInSir (String sirCaractere){
        return sirCaractere.indexOf('l');
    }

    public static int pozitieCaracter (String sirCaractere , char caractere) {
        return sirCaractere.indexOf(caractere);
    }

    public static char literaInSir (String sirCaractere , int pozitia ) {
        return sirCaractere.charAt(pozitia);
    }

}

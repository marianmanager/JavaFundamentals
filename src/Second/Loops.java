package Second;

public class Loops {
    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        //fori + enter - completeaza automat fori-ul
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i " + i + " j " + j);
            }
        }


        //am folosit for pentru a face o matrice de domino
        //se poate face pana la un nr N infinit
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (i != j && j != k && k != l) {
                            System.out.println(i + " " + j + " " + k + " " + l );
                        }
                    }
                }
            }
        }

    }
}

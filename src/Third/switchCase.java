package Third;

public class switchCase {
    public static void main(String[] args) {

        //un exemplu de switch case

        char directie = 'e';

        switch (directie) {
            case 'n':
                System.out.println("Mergem spre nord");
                break;
            case 's':
                System.out.println("Mergem spre sud");
                break;
            case 'e' :
                System.out.println("Mergem spre est");
                break;
            case 'w' :
                System.out.println("Mergem spre vest");
                break;
            default:
                System.out.println("Directie gresita");
        }

    }
}


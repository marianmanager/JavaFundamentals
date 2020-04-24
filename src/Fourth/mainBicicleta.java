package Fourth;

public class mainBicicleta {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle(75,2,20) ;
        bike.getCadence(); //o sa returneze 75
        System.out.println(bike.getCadence()); //o sa printeze - afiseze 75

        int cadence = bike.getCadence();
        System.out.println("Cadenta este " + cadence);

        System.out.println(Bicycle.counter); //ar trebui sa printeze 1
        Bicycle altaBicicleta = new Bicycle(80,4,56);
        System.out.println(Bicycle.counter); //printeaza 2

        //o sa afiseze adevarat true pentru ambele variante
        System.out.println(Bicycle.counter == bike.getCounter());
        System.out.println(bike.getCounter() == altaBicicleta.getCounter());

    }
}

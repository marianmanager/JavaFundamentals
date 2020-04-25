package Mostenirea;

public class MainClass {
    public static void main(String[] args) {

        Person1 A = new Person1(24,"Marian");
        Person1 B = new Person1();

        System.out.println("Aceasta Persoana " + A.getFirstName()+ " are " + A.getAge() + "de ani");
        A.setFirstName("Adrian");
        A.setAge(29);
        A.getLastName("Manager");

        System.out.println(A);

        Student S = new Student();
        System.out.println(S);

        Student S1 = new Student(38,"Ionut","Petrescu",8.99);
        System.out.println(S1.getMedia());
    }
}

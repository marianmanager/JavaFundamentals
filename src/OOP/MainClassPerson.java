package OOP;

public class MainClassPerson {
    public static void main(String[] args) {


        Person A = new Person(35, "Gabriel");
        Person B = new Person();

        System.out.println("This person " + A.getFname() + " has " + A.getAge() + " years old.");

        A.setAge(65);
        A.setFname("Adrian");
        A.setLname("Botezatu");
        System.out.println(A);

    }

}

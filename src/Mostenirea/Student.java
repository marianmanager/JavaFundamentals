package Mostenirea;

public class Student {

    private int age;
    private String firstName;
    private String lastName;
    private double media;

    Student () {
        super();
    }

    Student (int age,String firstName, String lastName,double media) {
        super ();

        this.media = media;
    }

    public double getMedia() {
        return this.media;
    }

}

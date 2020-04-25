package Mostenirea;

public class Person1 {

    private int age;
    private String firstName;
    private String lastName;

    Person1() {
        age = 20;
        firstName = "unkown";
        lastName = null;
    }
    Person1(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }
    //aici facem constructorul
    Person1(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    

    //aici sunt getters
    public int getAge() {
        return this.age;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    //iar aici von face setters

    public void setAge (int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String toString () {

        return "Numele acestei persoane este : " + this.firstName + " " + this.lastName + " si are varsta de " +
                this.age + " ";

    }


    public void getLastName(String manager) {
    }
}

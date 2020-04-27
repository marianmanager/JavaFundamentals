package OOP;

public class Person {
    private int age;
    private String fname;
    private String lname;

    Person () {
        age = 40;
        fname = "Unkown";
        lname = null;
    }

    Person(int age, String fname) {
        this.age = age;
        this.fname = fname;
    }
    Person(int age, String fname,String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public int getAge() {
        return this.age;
    }

    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String toString () {
        return "This person's name is " + this.fname + " " + this.lname + " and he/she is " + this.age + " years old.";
    }
}

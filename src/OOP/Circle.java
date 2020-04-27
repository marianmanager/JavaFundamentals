package OOP;

import java.util.Calendar;

public class Circle {

    //static--

    static final double PI = 3.14;
    //PI este proprietatea clasei

    static void showPI () {
        System.out.println(PI);
    }

    //preferabil in ordinea asta
    //State First

    //facem un constructor implicit

    double radius;

    public Circle () {

    }

    //constructor cu un parametru

    public Circle (double r) {
        radius = r;
    }

    //instance--
    //behaviour second

    public double getDiameter () {
        return 2 * radius;
    }

    public double getCircumference () {
        return 2 * PI * radius;
    }

    public double getArea () {
        return PI * radius * radius;
    }

    public void setRadius (double radius ) {
        this.radius = radius;
    }
}

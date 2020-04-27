package OOP;

public class MainClassCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 7;

        Circle c2 = new Circle();
        c2.radius = 5;

        Circle c3 = new Circle(11);

        System.out.println(c1.radius);
        System.out.println(c2.radius);
        System.out.println(c3.radius);
        System.out.println();
        //afiseaza referinta
        //dar putem schimba asta

        System.out.println(c1.getDiameter());
        System.out.println(c2.getDiameter());
        System.out.println(c3.getDiameter());
        System.out.println();

        System.out.println(c1.getCircumference());
        System.out.println(c2.getCircumference());
        System.out.println(c3.getCircumference());
        System.out.println();

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        System.out.println();

        System.out.println(Circle.PI);
        Circle.showPI();

        System.out.println("\nFolosim This");
        System.out.println(c1.getDiameter());
        c1.setRadius(767);
        System.out.println(c1.getDiameter());
        System.out.println();

        Square s1 = new Square(14);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());
        System.out.println();

        //acum sa punem si pe GIT
    }
}

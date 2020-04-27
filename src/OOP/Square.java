package OOP;

public class Square {

    static final int nrOfSides = 4;
    int side ;
    public Square (int s ) {
        side = s;
    }

    public int getArea () {
        return side * side;
    }

    public int getPerimeter () {
        return side * nrOfSides;
    }

}

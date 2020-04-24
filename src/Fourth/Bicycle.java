package Fourth;
//aici facem clasa bicicleta pe care o vom apela din clasa main

public class Bicycle {
    private int cadence;
    private int treapta;
    private int viteza;
    static int counter = 0;

    public Bicycle (int cadence, int treapta, int viteza) {
        this.cadence = cadence;
        this.treapta = treapta;
        this.viteza = viteza;
        this.counter++;
    }
    //astia sunt getters

    public int getCadence() {
        return cadence;
    }

    public int getCounter() {
        return counter;
    }

}

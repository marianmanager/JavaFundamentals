package Fourth;

public class varargs {
    //vom face o noua metoda

    static int sum (int... elements) {
        int result = 0;
        //folosim un fori simplificat
        for(int i : elements) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        //vom face un exemplu de varargs

        System.out.println(sum(1,2,3,4)); //rezultat 10
        System.out.println(sum(1)); //rezultat 1
        System.out.println(sum()); //rezultat 0

    }
}

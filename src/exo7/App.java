package exo7;

public class App {
    public static void main(String[] args) {
        Calculateur division = (a,b) -> a / b;
        Calculateur puissance = (a,b) -> Math.pow(a,b);
        int a =8;
        int b =4;
        System.out.println(division.effectuer(a,b));
        System.out.println(puissance.effectuer(a,b));
    }
}

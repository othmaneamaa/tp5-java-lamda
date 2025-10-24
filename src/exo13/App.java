package exo13;

public class App {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> aireRectangle = (longueur, largeur) -> longueur * largeur;

        
        System.out.println("Aire du rectangle (5, 3) : " + aireRectangle.apply(5, 3));
        System.out.println("Aire du rectangle (7, 2) : " + aireRectangle.apply(7, 2));
    }
    }


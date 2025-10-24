package exo5;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Operation somme = (a, b) -> a + b;
        Operation produit = (a, b) -> a * b;
        int a = 5;
        int b = 10;
        int[] t = new int[]{1, 2, 3, 4};
        
        
        int resultatSomme = t[0];
        for (int i = 1; i < t.length; i++) {
            resultatSomme = somme.calculer(resultatSomme, t[i]);
        }
        int resultatProduit = t[0];
        for (int i = 1; i < t.length; i++) {
            resultatProduit = produit.calculer(resultatProduit, t[i]);
        }

        System.out.println("Somme de " + a + " et " + b + " = " + somme.calculer(a, b));
        System.out.println("Produit de " + a + " et " + b + " = " + produit.calculer(a, b));
        System.out.println("Somme des éléments du tableau : " + resultatSomme);
        System.out.println("Produit des éléments du tableau : " + resultatProduit);
    }
}

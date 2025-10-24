package exo8;

public class App {
    public static void main(String[] args) {
   int[] nombres = {12, 5, 8, 20};


        Compareur compareur = (a, b) -> (a > b) ? a : b;

        int max = java.util.Arrays.stream(nombres)
                                  .reduce((a, b) -> compareur.comparer(a, b))
                                  .getAsInt();

        System.out.println("Le plus grand nombre est : " + max);
   }
}
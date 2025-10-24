package exo12;

public class App {
    public static void main(String[] args) {
       int[] nombres = {3, 8, 5, 10, 2, 7};

        
        OperationTableau somme = (tab) -> {
            int total = java.util.Arrays.stream(tab).sum();
            System.out.println("Somme des éléments : " + total);
            return total;
        };

       
        OperationTableau pairs = (tab) -> {
            System.out.print("Éléments pairs : ");
            java.util.Arrays.stream(tab)
                            .filter(n -> n % 2 == 0)
                            .forEach(n -> System.out.print(n + " "));
            System.out.println();
            return 0;
        };

        
        somme.effectuer(nombres);
        pairs.effectuer(nombres);
    }
}
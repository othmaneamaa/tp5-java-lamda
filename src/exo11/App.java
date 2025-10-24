package exo11;

public class App {
    public static void main(String[] args) {
       String[] mots = {"kayak", "java", "radar", "lambda"};
        VerifierPalindrome verif = (s) -> {
            String inverse = new StringBuilder(s).reverse().toString();
            return s.equalsIgnoreCase(inverse);
        };

        
        for (String x : mots) {
            if (verif.estPalindrome(x)) {
                System.out.println(x + " est un palindrome ");
            } else {
                System.out.println(x + " n'est pas un palindrome ");
    }
        }
    }
}

package exo14;

public class App {
    public static void main(String[] args) {
      String[] chaines = {"orange", "pomme", "cerise"};

        Comparateur comp = (s1, s2) -> s1.length() > s2.length();

        for (int i = 0; i < chaines.length - 1; i++) {
            String s1 = chaines[i];
            String s2 = chaines[i + 1];

            
            System.out.println(
                comp.comparer(s1, s2)
                ? s1 + " est plus longue que " + s2
                : s1 + " n'est pas plus longue que " + s2
            );
        }
    }
}

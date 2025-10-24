package exo6;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <String> l = Arrays.asList("Ananas", "Banane", "Abricot", "Cerise");
        for(String s: l){
            Filtre filtre = str -> str.startsWith("A");
            if(filtre.verifier(s)){
                System.out.println(s);
            }
        }


    }
}

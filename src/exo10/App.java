package exo10;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
       


        List<String> animaux = Arrays.asList("chat", "chien", "cheval");


        System.out.println("--majuscules-- ");
        animaux.stream()
               .map(String::toUpperCase)      
               .forEach(System.out::println); 

       
        System.out.println("--Tri-- ");
        animaux.stream()
               .sorted(String::compareTo)      
               .forEach(System.out::println); 
    }
}



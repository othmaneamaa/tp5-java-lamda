package exo9;

import java.util.Arrays;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
       
       
        int[] nombres = {5, 12, 7, 18, 3};

       
        Predicate<Integer> superieurA10 = n -> n > 10;

     
        Arrays.stream(nombres)
              .filter(n -> superieurA10.test(n))
              .forEach(System.out::println);
            }
         }

   


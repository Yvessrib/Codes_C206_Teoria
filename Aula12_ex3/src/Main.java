import java.util.*;

public class Main {
    public static void main(String[] args) {

        int aux = 100000;
        long Ti, Tf, Tt;

        List <Integer> met1 = new ArrayList<>();
        Set <Integer> met2 = new HashSet<>();
        Map <Integer,Integer> met3 = new HashMap<>();

        //Inserindo na lista
        Ti = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            met1.add(i);
        }
        Tf = System.currentTimeMillis();
        Tt = Tf - Ti;
        System.out.println("Tempo de inserir na Lista: " + Tt + " ms");

        //Inserindo no HashSet
        Ti = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            met2.add(i);
        }
        Tf = System.currentTimeMillis();
        Tt = Tf - Ti;
        System.out.println("Tempo de inserir no HashSet: " + Tt + " ms");

        //Inserindo no HashMap
        Ti = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            met3.put(i, i);
        }
        Tf = System.currentTimeMillis();
        Tt = Tf - Ti;
        System.out.println("Tempo de inserir no HashMap: " + Tt + " ms");

        //Buscando na lista
        Ti = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            met1.contains(i);
        }
        Tf = System.currentTimeMillis();
        Tt = Tf - Ti;
        System.out.println("alo");
        System.out.println("Tempo de inserir na Lista: " + Tt + " ms");

        //Buscando no HashSet
        Ti = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            met2.contains(i);
        }
        Tf = System.currentTimeMillis();
        Tt = Tf - Ti;
        System.out.println("Tempo de inserir no HashSet: " + Tt + " ms");

        //Buscando na lista
        Ti = System.currentTimeMillis();
        for (int i = 0; i < aux; i++) {
            met3.containsKey(i);
        }
        Tf = System.currentTimeMillis();
        Tt = Tf - Ti;
        System.out.println("Tempo de inserir na Lista: " + Tt + " ms");




    }
}

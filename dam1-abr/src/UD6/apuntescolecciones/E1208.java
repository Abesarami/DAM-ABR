package UD6.apuntescolecciones;

import java.util.*;

public class E1208 {
    private static final int MAX = 20;

    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < MAX; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        System.out.println(numeros);

        Integer[] t = numeros.toArray(new Integer[0]);

        Arrays.sort(t);

        Collection<Integer> numerosMenorMayor = Arrays.asList(t);

        System.out.println(numerosMenorMayor);

        Comparator<Integer> ordenMayorMenor = Comparator.reverseOrder();
        
        Arrays.sort(t, ordenMayorMenor);

        Collection<Integer> numerosMayorMenor = Arrays.asList(t);

        System.out.println(numerosMayorMenor);

    }
}

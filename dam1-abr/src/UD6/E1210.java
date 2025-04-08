package UD6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

//E1210. Escribir en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella, crear un
//conjunto con los elementos de la lista sin repetir, otro con los repetidos y otro con los
//elementos que aparecen una sola vez en la lista original.
public class E1210 {

    public static void main(String[] args) {
        List<Integer>numeros = new ArrayList<>(0);
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            Integer numero= (Integer) rnd.nextInt(10 - 1 + 1) + 1;

            numeros.add(numero) ;

        }
    }
}

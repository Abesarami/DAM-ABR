package UD6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//EP1222. Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
// que se insertarán en una colección, de forma que se conserve el orden de inserción y
// que no puedan repetirse. Al final, la colección se mostrará por pantalla.
public class E1222 {
    List<Integer> numeros = new ArrayList<>(0);
    Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
        Integer numero= (Integer) rnd.nextInt(10 - 1 + 1) + 1;

        numeros.add(numero) ;

    }
}

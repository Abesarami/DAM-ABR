package ud2.ejemplos;

import java.util.*;

public class casicero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero y te dire si es casi 0");
        double numero = sc.nextDouble();
        sc.close();
        if (numero > -1 && numero < 1 && numero != 0) {
            System.out.println("Tu numero es casi cero");
        } else {
            System.out.println("Tu numero no es casi cero Este programa fue fabricado por ABR");
        }

    }
}

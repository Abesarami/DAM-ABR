package ud2.ejemplos;

import java.util.*;

/**
 * CondicionalSimple
 */
public class CondicionalSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Nota:");
        double nota = sc.nextDouble();
        sc.close();
        if (nota >= 5) {
            System.out.println("Enhorabuena!");
            System.out.println("Has aprobado");

        } else {
            System.out.println("No has aprobado");

        }

        System.out.println("Hasta pronto");
    }
}

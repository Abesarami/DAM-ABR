package ud2.bucles;
import java.util.*;
public class E0306 {
    public static void main(String[] args) {
        System.out.println("Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.");

        System.out.println("introduce un numero");

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        long NumInicial=0;
        while ( num>NumInicial ) {
            NumInicial=NumInicial+1;
            System.out.println(NumInicial);
        }
        sc.close();
    }

}

package ud2.abrexamenrec;

/*
Antonio Besada Ramilo 
 */
import java.util.*;

public class Galibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPuentes;
        int numeroCarriles = 1;
        int altura;
        int alturaMinima = 1000;

        System.out.println("Introduce el numero de puentes que hay en tu travesia");
        numeroPuentes = sc.nextInt();
        do {
            System.out.println("Introduce el numero de carriles");
            numeroCarriles = sc.nextInt();
            do {
                System.out.println("Introduce galibo");
                altura = sc.nextInt();
                if (altura <= 800 && altura >= 200) {
                    if (alturaMinima > altura) {
                        alturaMinima = altura;
                    }
                } else {
                    numeroCarriles = 0;
                    numeroPuentes = 0;
                    System.out.println("Numero INCORRECTO");
                }

                numeroCarriles = numeroCarriles - 1;
            } while (numeroCarriles > 0);
            numeroPuentes = numeroPuentes - 1;
        } while (numeroPuentes > 0);

        System.out.println("La altura minima de tu travesia es: " + alturaMinima);
        sc.close();
    }
}

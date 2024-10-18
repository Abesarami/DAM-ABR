// Driver/Navigator: Álvaro Barrientos Pazos

package Examen.examen;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("El programa funciona? (0-4) ");
        double funciona = sc.nextDouble();

        System.out.println("El programa funciona y es eficiente? (0-1) ");
        double eficiente = sc.nextDouble();

        System.out.println("Usa estructuras y tipos de datos adecuados al problema? (0-1) ");
        double estructuras = sc.nextDouble();

        System.out.println("Usa identificadores adecuados? (0-1.5) ");
        double identificadores = sc.nextDouble();

        System.out.println("El programa es legible? (0-1.5) ");
        double legible = sc.nextDouble();

        System.out.println("Presenta la información completa al usuario? (0-1) ");
        double presentacion = sc.nextDouble();

        sc.close();
        
        double resultado = funciona + eficiente + estructuras + identificadores + legible + presentacion;
        System.out.println("El resultado final es: " + resultado);
    }
}

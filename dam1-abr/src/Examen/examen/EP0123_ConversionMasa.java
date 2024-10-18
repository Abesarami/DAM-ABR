package Examen.examen;
/* Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. 
El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).

1 kilogramo = 1000 gramos
1 libra = 453.592 gramos

El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. 
Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa 
mostrará por pantalla el resultado con la unidad de medida adecuada.*/

import java.util.Scanner;

public class EP0123_ConversionMasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double g_kilo = 1000;
        final double g_libra = 453.592;

        System.out.print("Introduzca la cantidad de masa: ");
        double masa = scanner.nextDouble();

        System.out.print("Introduzca la unidad de medida origen (0 para kilogramos o 1 para libras): ");
        int unidadOrigen = scanner.nextInt();


        /* if (unidad == k)  
                true: de kilos a libras 
                false: de libras a kilos */
        double masaFinal = (unidadOrigen == '0') ? (masa * g_kilo / g_libra) : (masa * g_libra / g_kilo);

        // Cambiar la unidad de medida del resultado 
        String unidadDestino = (unidadOrigen == '0') ? "libras" : "kilogramos";

        System.out.printf("%.2f %s son %.2f %s", masa, unidadOrigen, masaFinal, unidadDestino);

        scanner.close(); 
    }
}

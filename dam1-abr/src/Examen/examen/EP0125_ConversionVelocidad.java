package Examen.examen;
/* Escribe un programa que convierta unidades de velocidad entre km/h, m/s y mph viceversa. 
El programa solicitará al usuario la cantidad de velocidad y la unidad de medida origen.

1 km/h = 0.27778 m/s
1mph = 1,60934 km/h

El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. 
Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa 
mostrará por pantalla el resultado con la unidad de medida adecuada.*/

import java.util.Scanner;

public class EP0125_ConversionVelocidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double kmh = 0.27778; // km/h -> m/s
        final double mph = 1.60934; // mph -> km/h

        System.out.print("Introduzca la velocidad: ");
        double velocidad = scanner.nextFloat();
        System.out.print("Introduzca la unidad de medida origen (0 para km/h, 1 para m/s y 2 para mph)");
        int unidadOrigen = scanner.nextInt();
        
        // Operador ternario para las conversiones
        double velocidadKmh = (unidadOrigen == 0) ? velocidad 
                            : (unidadOrigen == 1) ? velocidad / kmh
                            : velocidad * mph;

        double velocidadMs = velocidadKmh * kmh;
        double velocidadMph = velocidadKmh / mph;

        // Definir la unidad de salida
        String unidadEntrada = (unidadOrigen == 0) ? "km/h" 
                             : (unidadOrigen == 1) ? "m/s" 
                             : "mph";

        System.out.printf("La velocidad en %.2f %s es %.2f km/h\n", velocidad, unidadEntrada, velocidadKmh);
        System.out.printf("La velocidad en %.2f %s es %.2f m/s\n", velocidad, unidadEntrada, velocidadMs);
        System.out.printf("La velocidad en %.2f %s es %.2f mph\n", velocidad, unidadEntrada, velocidadMph);

        scanner.close();
    }
    
}
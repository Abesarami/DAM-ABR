package Examen.examen;
/* A través del programa Erasmus estos días profesorado polaco está visitando el centro educativo. 
Haz un programa que facilite la conversión de importes en Euros a la moneda polaca correspondiente 
y viceversa. Busca el nombre de la moneda y la correspondencia en Euros en Internet. */

import java.util.Scanner;

public class EP0136_ConversionMonedaPolaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double zloty = 4.29;

        System.out.print("\nIntroduzca la cantidad de dinero: ");
        float dinero = scanner.nextFloat();
        System.out.print("\nIntroduzca la moneda de origen (0 = euros y 1 = zlotys): " );
        float monedaOrigen = scanner.nextInt();
        scanner.close();

        double conversion = (monedaOrigen == 0) ? (dinero * zloty) : (dinero / zloty);
        
        String monedaOrigenStr = (monedaOrigen == 0) ?  "euros" : "zlotys";
        String monedaDestinoStr = (monedaOrigen == 0) ? "zlotys" : "euros";

        System.out.printf("\n%.2f %s son %.2f %s", dinero, monedaOrigenStr, conversion, monedaDestinoStr);
    }
}
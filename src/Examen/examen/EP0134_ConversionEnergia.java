package Examen.examen;
/* Escribe un programa que permita convertir unidades de energía entre julios (J), calorías (cal) y kilovatios-hora (kWh). 
El usuario deberá ingresar la cantidad de energía, así como la unidad de origen y destino.

1 cal = 4.184 J
1 kWh = 3,600,000 J

El programa deberá realizar la conversión y mostrar el resultado. */

import java.util.Scanner;

public class EP0134_ConversionEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double CALORIAS = 4.184; // 1 cal = J
        final double KWH = 3_600_000; // 1 kWh = J

        System.out.print("Introduzca la cantidad de energía: ");
        double energia = scanner.nextDouble();
        System.out.print("Introduzca la unidad de origen (0 = J, 1 = cal, 2 = kWh): ");
        int uOrigen = scanner.nextInt();
        System.out.print("Introduzca la unidad de destino (0 = J, 1 = cal, 2 = kWh): ");
        int uDestino = scanner.nextInt();
        scanner.close();

        // Calculos de conversión
        double energiaFinal = (uOrigen == 0) ? 
                            (uDestino == 0) ? (energia): // julios a julios
                            (uDestino == 1) ? (energia / CALORIAS): // julios a calorías
                            (energia / KWH): // julios a kWh

                           (uOrigen == 1) ?
                            (uDestino == 0) ? (energia * CALORIAS): // calorías a julios
                            (uDestino == 1) ? (energia): // calorías a calorías
                            (energia * CALORIAS / KWH): // calorías a kWh

                             (uDestino == 0) ? (energia * KWH): // kWh a julios
                             (uDestino == 1) ? (energia * KWH / CALORIAS): // kWh a calorías
                             (energia); // kWh a kWh

        // Cambiar la unidad en el print 
        String uOrigenStr = (uOrigen == 0) ? "julios" : 
                            (uOrigen == 1) ? "calorías" :
                                             "kWh";
        
        String uDestinoStr = (uDestino == 0) ? "julios" :
                             (uDestino == 1) ? "calorías" :
                                              "kWh";

        System.out.printf("%.2f %s son %.2f %s", energia, uOrigenStr, energiaFinal, uDestinoStr);
    }
}

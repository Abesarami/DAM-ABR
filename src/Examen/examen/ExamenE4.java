/* 
Examen DAM Curso 2023 - 2024  Ejercicio 3

Realiza un programa que simule el funcionamiento de un cajero automático. El programa solicitará al usuario el importe en efectivo que desea retirar, que será un número 
entero de euros (€). El programa calculará el número mínimo de billetes de 50, 20, 10 y 5 euros para obtener dicho importe y presentará la información al usuario.

Si el importe introducido por el usuario no es múltiplo de 5 se informará también al usuario del importe que el cajero no es capaz de satisfacer por no disponer de billetes 
de esa cantidad. Por ejemplo, si el usuario introduce 78 €, el programa informará de que se retirarán 75 € en los billetes que corresponda y que 3 € no se pueden retirar por 
no existir billetes tan pequeños.

 */

package Examen.examen;

import java.util.Scanner;

public class ExamenE4 {
    public static void main(String[] args) {
        
        final int CINCUENTA = 50;        
        final int VEINTE    = 20;
        final int DIEZ      = 10;
        final int CINCO     = 5;
        
        Scanner sc = new Scanner(System.in);
       
        int importe;

        System.out.print("Introduce el importe a extraer: ");
        importe = sc.nextInt();
        sc.close();


        // Dividimos entre el valor del billete y eliminamos los decimales
        // Utilizamos el operador "%" para quedarnos con el resto de la división.
        // Repetimos el proceso hasta quedarnos sin billetes.

        int b50 = importe/CINCUENTA;    
        importe = importe%CINCUENTA;           

        int b20 = importe/VEINTE;
        importe = importe%VEINTE;

        int b10 = importe/DIEZ;
        importe = importe%DIEZ;

        int b5 = importe/CINCO;

        System.out.printf("billetes de 50:\t%d\nbilletes de 20:\t%d\nbilletes de 10:\t%d\nbilletes de 5:\t%d\n",b50,b20,b10,b5);

        String mensaje = importe%5 == 0 ? "No sobra nada" : "No es posible extraer el de: " + importe%5 + " euros";
        
        System.err.println(mensaje);

    }

}

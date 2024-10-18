/* 
Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes, kilobytes, megabytes y gigabytes. 
Solicita al usuario la cantidad de datos y la unidad de origen y destino 
*/

package Examen.examen;

import java.util.Scanner;


public class MegasKilobitesyGb {
    public static void main(String[] args) {
        final int KILOBYTES = 1000;
        final int GIGABYTES = 1000000;
       
        Scanner sc = new Scanner(System.in);
       
        double cOrigen; // Cantidad Origen
        double uOrigen; // Unidad Origen

        double uDestino; // Unidad Destino
        double cDestino; // Cantidad Destino


        double cMegas;

        System.out.println("Introduce la unidad de origen:\nMB = 0\nKB = 1\nGB = 2");
        uOrigen = sc.nextInt();
        
        System.out.print("Introduce la cantidad de origen: ");
        cOrigen = sc.nextInt();

        System.out.println("Introduce la unidad de destino:\nMB = 0\nKB = 1\nGB = 2");
        uDestino = sc.nextInt();
        sc.close();

        cMegas = uOrigen == 0 ? cOrigen : uOrigen == 1 ? cOrigen*KILOBYTES : cOrigen * GIGABYTES;
        cDestino = uDestino == 0 ? cMegas : uDestino == 1 ?  cMegas/KILOBYTES : cMegas/GIGABYTES;
        
        String letraUnidad = uDestino == 0 ? "MB" : uDestino == 1 ? "KB":"GB";

        System.out.printf("El resultado es: %.3f%s",cDestino,letraUnidad);

        
    }
}

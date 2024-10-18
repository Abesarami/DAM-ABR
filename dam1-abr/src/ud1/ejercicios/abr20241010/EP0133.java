package ud1.ejercicios.abr20241010;

import java.util.Scanner;

/**
 * EP0133
 */
public class EP0133 {

    public static void main(String[] args) {
        /*
         * Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes,
         * kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la cantidad de datos y
         * la unidad de origen y destino.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("En este programa convertiremos bytes en megabytes ");
        System.err.println("introduce numero de bytes");
        double bytes = sc.nextDouble();
        double kilobytes = bytes * (1/1024);
        double megabytes = kilobytes * (1/1024);
        double gigabytes = megabytes * (1/1024);
        System.out.println(gigabytes);
        sc.close();

    }
}
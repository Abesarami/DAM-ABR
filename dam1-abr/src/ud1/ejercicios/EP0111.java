package ud1.ejercicios;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {

        double precio;
        double iva;

        Scanner sc = new Scanner(System.in);

        System.out.println("cual es el precio del producto");
        precio = sc.nextDouble();
        System.out.println("Muy bien el precio es:" + precio + " y cual es el iva que se le aplica? añadir sin %");
        iva = sc.nextDouble();
        sc.close();
        Double Porcentage_Iva = iva * 0.01;
        double precio_final = precio * Porcentage_Iva + precio;

        System.out.println("El iva sera" + Porcentage_Iva + ".Y el precio total con el iva sera " + precio_final);

        
    }
}

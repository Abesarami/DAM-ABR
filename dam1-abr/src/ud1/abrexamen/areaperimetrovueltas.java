package ud1.abrexamen;
/*
 * 
 * Antonio Besada Ramilo 
 */

import java.util.Scanner;

public class areaperimetrovueltas {
    public static void main(String[] args) {
        double largo, ancho, perimetroCirculo, radioCirculo, areaCirculo, longitudRectangulo, perimetroTotal,
                areaRectangulo, areatotal, vueltas, MetrosExtra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el largo de la pista en metros");
        largo = sc.nextDouble();
        System.out.println("Introduce el ancho de la pista en metros");
        ancho = sc.nextDouble();
        sc.close();
        radioCirculo = ancho / 2;

        perimetroCirculo = 2 * Math.PI * radioCirculo;

        longitudRectangulo = largo - radioCirculo * 2;

        perimetroTotal = longitudRectangulo * 2 + perimetroCirculo;

        System.out.printf("El perimetro del terreno es de %.2f %n", perimetroTotal);

        areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
        areaRectangulo = longitudRectangulo * (2 * radioCirculo);
        areatotal = areaCirculo + areaRectangulo;
        System.out.printf("El area del terreno es %.2f %n", areatotal);
        vueltas = (int) (21097 / perimetroTotal);
        MetrosExtra = (21097 % perimetroTotal);

        System.out.printf(
                "Para hacer una media maraton(21.097 metros) en este terreno hay que hacer un total de: %.0f y %.0f metros",
                vueltas, MetrosExtra);
    }
}

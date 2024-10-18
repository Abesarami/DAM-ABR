package ud1.ejercicios.abr20241010;

import java.util.Scanner;


/**
 * EP0129
 */
public class EP0129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double  siete = 7.0;
        double resto;
        double numero;

        System.out.println("En este programa buscaremos que tienes que sumar orestar a un numero que nos deas para que sea multiplo de 7");
        System.out.println("Introduce numero");
        numero = sc.nextDouble();
        resto =  siete%numero;
        double division = siete/numero;
        System.out.printf("estes son los numeros %.2f %.0f",division,resto);
        System.out.println("Introduce el primer numero sin la coma");
        double divisionSinDecimal = sc.nextDouble();
        double resultado = divisionSinDecimal * 7; 
        System.out.println(resultado);
        sc.close();


    }
}
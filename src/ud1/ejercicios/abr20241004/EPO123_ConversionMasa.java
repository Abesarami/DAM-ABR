package ud1.ejercicios.abr20241004;

/**
 * EPO123-ConversionMasa
 */

import java.util.Scanner;

public class EPO123_ConversionMasa {
    public static void main(String[] args) {
        double masa;
        int unidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola en este programa convertiremos una masa que tu nos deas en gramos");
        System.out.println("primero necesitamos que nos deas el numero de la masa");
        masa = sc.nextDouble();
        System.out.println("ahora dime en que unidad de medida me lo estas dando 1 kg 2 libra");
        unidad = sc.nextInt();

        if (unidad <= 1) {
            System.out.println(masa * 1000);

        } else {
            System.out.println(masa * 453.592);
        }
        sc.close();

    }
}
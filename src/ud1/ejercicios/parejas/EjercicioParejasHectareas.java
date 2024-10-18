package ud1.ejercicios.parejas;

import java.util.Scanner;

/**
 * ej1 Antonio Besada Ramilo Conductor
 * pabLo copiloto
 * 
 */
public class EjercicioParejasHectareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double opeFubo, opeBalon, opeReti;
        opeFubo = (100*100.0)/(105*70);
        opeBalon = (100*100.0)/(28*15);
        opeReti = (1/125.0);
        double medida, medidaFubol, canchaBaloncesto, parques;
        System.out.println(
                "En este programa vamos a hacer conversion de hectareas a campos de futbol, canchas de baloncesto y demas. Introduzca numero de hectareas");
        medida = sc.nextDouble();

        medidaFubol = medida * opeFubo;
        canchaBaloncesto = medida * opeBalon;
        parques = medida * opeReti;

        System.out.println("El numero de hectareas que me has proporcionado es: " + medida);
        System.out.printf("Que en campos de futbol es %.2f campos de fubol",medidaFubol);
        System.out.printf(" Que son %.2f canchas de baloncesto ",canchaBaloncesto);
        System.out.printf(" Que en parques de retiro es %.4f parques de retiro ",parques);
       
        sc.close();
    }
}
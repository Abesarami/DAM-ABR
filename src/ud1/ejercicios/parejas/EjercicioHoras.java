package ud1.ejercicios.parejas;

import java.util.Scanner;

public class EjercicioHoras {
    public static void main(String[] args) {
        final double horas = 240;
        final double sesiones = (horas * 60) / 50;
        double sesionesSinApercibimiento = sesiones * 0.06;
        final double sesionesSinPerdida = sesiones * 0.1;
        double faltas;
        double cuantasquedanAP;
        double cuantasquedanEC;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Hola vamos a calcular cuantas faltas te quedan disponibles en programacion, inserte el numero de sesiones a las que has faltado");
        faltas = sc.nextInt();
        cuantasquedanAP = sesionesSinApercibimiento - faltas;
        cuantasquedanEC = sesionesSinPerdida - faltas;

        System.out.printf("te quedan %.0f antes del apercibimiento y %.0f antes de la perdida de evaluación %n",
                cuantasquedanAP, cuantasquedanEC);

        String resultado = faltas > sesionesSinApercibimiento  ? "apercibimiento" : "no hay apercibimiento";
        String resultado2 = faltas > sesionesSinPerdida  ? "perdida" : "no hay perdida";
        System.out.println(resultado);
        System.out.println(resultado2);
        sc.close();

    }

}

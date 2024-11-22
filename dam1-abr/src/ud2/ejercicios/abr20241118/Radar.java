package ud2.practicas;

import java.util.Scanner;

public class Radar {

    public static void main(String[] args) {
        final double DISTANCIA = 10;
        final int LIMITE = 120;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los segundos que tardo en recorrer la distancia");
        int tiempo = sc.nextInt();
        sc.close();
        int multa = multaInfraccion(LIMITE, excesoVelocidad(DISTANCIA, tiempo, LIMITE));
        if (multa == 0){
            System.out.println("Velocidade dentro do límite");
        }else{
            System.out.println("Infracción por exceso de velocidade!! Multa de " + multa + " euros!!");
        }
    }

    public static int excesoVelocidad(double distancia, int tiempo, int limite) {
        int exceso = 0;
        if ((distancia / (tiempo / 3600.0) > limite)) {
            exceso = (int) ((distancia / (tiempo / 3600.0)) - limite);
        }
        return exceso;
    }

    public static int multaInfraccion(int limite, int excesoVelocidade) {
        int multa = 0;
        if (limite <= 50 && excesoVelocidade > 0) {
            if (excesoVelocidade <= 20 ) {
                multa = 100;
            } else if (excesoVelocidade > 20 && excesoVelocidade <= 30) {
                multa = 300;
            } else if (excesoVelocidade > 30 && excesoVelocidade <= 40) {
                multa = 400;
            } else if (excesoVelocidade > 40 && excesoVelocidade <= 50) {
                multa = 500;
            } else {
                multa = 600;
            }
        }

        if (limite >= 60 && excesoVelocidade > 0) {
            if (excesoVelocidade <= 30) {
                multa = 100;
            } else if (excesoVelocidade > 30 && excesoVelocidade <= 50) {
                multa = 300;
            } else if (excesoVelocidade > 50 && excesoVelocidade <= 60) {
                multa = 400;
            } else if (excesoVelocidade > 60 && excesoVelocidade <= 70) {
                multa = 500;
            } else {
                multa = 600;
            }
        }
        return multa;
    }
    
}
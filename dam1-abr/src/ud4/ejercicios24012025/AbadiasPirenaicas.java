package ud4.ejercicios24012025;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {
    public static void main(String[] args) {
        System.out.println("Introduce las alturas de las montañas de 1 en 1 en metros sin decimales");
        int entrada = 0, contador = 0;
        int validoContador = 0;
        boolean valido = true;
        Scanner sc = new Scanner(System.in);

        int[] montañas = new int[0];
        int[] validos = new int[0];
        while (entrada >-1 && contador < 1000) {
            contador++;
            entrada = sc.nextInt();
            if (entrada>-1) {
                montañas = Arrays.copyOf(montañas, montañas.length + 1);
            montañas[montañas.length - 1] = entrada;
            }else{
            
            }
        }
        for (int i = 0; i < montañas.length; i++) {
            valido = true;
            for (int j = 1; j < montañas.length-1; j++) {
                if (montañas[i] < montañas[j] && valido) {
                     validos = Arrays.copyOf(validos, validos.length + 1);
                    validos[validos.length - 1] = i;
                    validoContador++;
                } else {
                    valido = false;
                }
                if (valido) {
                  
                }
            }
        }


        System.out.println("Podeis construir: "+validoContador);
        System.out.println("En las montañas: "+Arrays.toString(validos));
    }
}

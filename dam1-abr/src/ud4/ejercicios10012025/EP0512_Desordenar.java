package ud4.ejercicios10012025;


import java.util.Arrays;
import java.util.Random;


import static ud4.ArraysUtil.arrayAleatorio;

public class EP0512_Desordenar {
    public static void main(String[] args) {
       int[] t = arrayAleatorio(60,1,10);
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
       desordenar(t);
        System.out.println(Arrays.toString(t));
    }
    
    public static void desordenar(int[] t){
         Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int nuevaPosicion = rnd.nextInt(t.length);
            if (nuevaPosicion != i){
                int aux = t[i];
                t[i]= t[nuevaPosicion];
                t[nuevaPosicion]=aux;
            }
        }


            

    }
}

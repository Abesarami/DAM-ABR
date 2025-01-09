package ud4.apuntes;

import java.util.Arrays;
import java.util.Random;

public class E0505 {

    static int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];
        Random rnd = new Random();

        for(int i = 0; i < longitud; i++) {
            int numeroAleatorio = rnd.nextInt(fin);
           if (numeroAleatorio%2==0) {
    
            t[i] = numeroAleatorio;
            
           }else if (numeroAleatorio<(fin-1)) {
            t[i] = numeroAleatorio+1;
           }else{
            t[i] = numeroAleatorio-1;
           }
            }

        return t;

       

    }
    public static void main(String[] args) {
      int[] t = rellenaPares(10, 20);
        System.out.println(Arrays.toString(t));
    }

}

package ud4.apuntes;

import java.util.Arrays;

public class ImprimirArrays {
    public static void main(String[] args) {
        int[] t = ArraysAleatorios.arrayAleatorio(5, -10, 10);

        System.out.println(Arrays.toString(t));

        for (int e : t)
            System.out.print(e + " ");
        System.out.println();

        for(int i = 0; i < t.length; i++) 
            System.out.print(t[i] + " ");
        System.out.println();        
    }
}

package ud4.apuntes;
import java.util.Arrays;

import ud4.ArraysUtil;

public class ParesNoseguro {

    public static void main(String[] args) {
        int[] t = new int[0];
        t= ArraysUtil.arrayAleatorio(10, 1, 10);
        for (int i =0;i<t.length;i++) {
            if (t[i]%2!=0) {
                int aux= t[i];
                aux = aux+1;
                t[i]=aux;
                
            }
        }
        System.out.println(Arrays.toString(t));
    }
}

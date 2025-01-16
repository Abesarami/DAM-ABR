package ud4.apuntes;

import java.util.Random;
import ud4.ArraysUtil;

public class E0512 {
    public static void main(String[] args) {
        int[][] t = new int[5][5];
    Random rnd = new Random();
    for(int i = 0;i<t.length;i++){
            for (int j = 0; j < t[i].length; j++) {
                t[i][j]=10*i+j;
            }
        }
    
        mostrarMatriz(t);
    } 
}
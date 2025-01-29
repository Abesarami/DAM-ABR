package ud4.stringsapuntes;

import java.util.Arrays;
import java.util.Scanner;

public class E0613 {

    public static void main(String[] args) {
        System.out.println("Introduce Frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        char[] caracteres = frase.toCharArray();
        int[]   cuantos = new int[0];
        for (int i = 0; i < caracteres.length; i++) {
            cuantos = Arrays.copyOf(cuantos,cuantos.length+1);
            for (int j = 0; j < caracteres.length; j++) {
                 if (caracteres[i] == caracteres[j]  ){

                     cuantos[i]=cuantos[i]+1;


                 }


            }

        }
        for (int i = 0; i < caracteres.length; i++) {
            if (cuantos[i]>1){
                System.out.println(caracteres[i]+": "+cuantos[i]+" veces");
            }else{
                System.out.println(caracteres[i]+": solo una vez");
            }




        }
    }
}

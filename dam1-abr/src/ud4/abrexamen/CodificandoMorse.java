package ud4.abrexamen;
/*
 * Autor Antonio Besada Ramilo
 */
public class CodificandoMorse {
    public static void main(String[] args) {
        System.out.println(numPuntosMorse("?"));
        System.out.println(numPuntosMorse("!"));
        System.out.println(numPuntosMorse("SI"));
        System.out.println(numPuntosMorse("vale"));
    }

    static int numPuntosMorse(String frase){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!? ";
        frase = frase.toUpperCase();
        int[] valores = { 5,9,11,7,1,9,9,7,3,13,9,9,7,5,11,11,13,7,5,3,7,9,9,11,13,11,19,15,2};
        int numero = 0;
        char [] arrayFrase = frase.toCharArray();
        
        for (int i = 0; i < arrayFrase.length; i++) {
            if (i!=1&&i != arrayFrase.length-1) {
        
                numero = 3+numero+valores[letras.indexOf(arrayFrase[i])];
             
           
            }else
            numero = numero+valores[letras.indexOf(arrayFrase[i])];
        }


        return numero;

    }


}

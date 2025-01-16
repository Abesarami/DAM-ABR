package ud4.ejercicios15012025;

import java.util.Arrays;
import java.util.Random;

public class BuscandoLetras {

    public static void main(String[] args) {
        String[] t = {
                "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto" };

        System.out.println(fraseAleatoria(t));
        System.out.println(buscarLetra(fraseAleatoria(t),'a'));
            }
        
            private static int buscarLetra(String t,char caracter) {
               
                int numero= 0;
                System.out.println(t);
                char[] tablaChar = t.toCharArray();  
                Arrays.sort(tablaChar);
                char[] tabla2 = new char[tablaChar.length];
                for (int i = 0;i<tablaChar.length;i++){
                    tabla2[i]='a';

                }
                
                for(int i = 0;i<tablaChar.length;i++){
                    if (Arrays.equals(tabla2, tablaChar[i], tabla2[i], tabla2, i, i)==true) {
                        numero=numero+1;
                        
                    }

                }

              
                return numero;
            }
        
            static String fraseAleatoria(String[] t) {
        String frase;
        Random rnd = new Random();
        frase = t[rnd.nextInt(t.length)];

        return frase;
    }
}

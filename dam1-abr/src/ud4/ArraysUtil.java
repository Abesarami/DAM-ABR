package ud4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* 
 * 
 * Chuleta 
 * 
 * si quieres copiar un array la manera facil es usar Arrays.CopyOf((el array),(la longitud del array suele ser nombre.lenght))
 * hay muchas mas versiones de este metodo para poder copiar solo tramos 
 * tambien puedes copiar clonandolo con nombreArrayClonado = nombreArray.clone() ¡TAMBIEN SE USA CON OBJETOS!
 * 
 * 
 */
public class ArraysUtil {

    /**
     * Genera y devuelve un array de n números aleatorios entre -9 y 9, incluyendo
     * el 0.
     * 
     * @param n
     * @return
     */
    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(19) - 9; // Asigna un número entre -9 y 9
        }

        return t;
    }

    /**
     * Genera y devuelve un array de n números aleatorios entre un número de inicio
     * y uno de fin.
     * 
     * @param n
     * @param rndInicio
     * @param rndFin
     * @return
     */
    public static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] t = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }

        return t;
    }

    /**
     * Rellena una tabla con números enteros leídos de teclado.
     * 
     * @param t
     */
    public static void leerNumeros(int[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }

    /**
     * Cuenta las apariciones de un número (clave) en un array de enteros
     * 
     * @param t
     * @param clave
     * @return
     */
    public static int contar(int t[], int clave) {
        int contar = 0;

        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                contar++;

        return contar;
    }

    /**
     * Suma los elementos de un array de enteros
     * 
     * @param t
     * @return
     */
    public static int sumar(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }

    public static Integer maximo(int t[]) {
        if (t == null || t.length == 0)
            return null;

        Integer maximo = t[0];

        for (int i = 1; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];

        return maximo;
    }
    public static int[] sinRepetidos(int t[]){
      int[]array= t.clone();
        for(int i = 0; i < t.length; i++){
            Arrays.sort(array);
            
            if (Arrays.binarySearch(array, i)==1    ) {
                
            }
            
        }

        return array;
        
    }

    /**
     * @param longitud
     * @param fin
     * @return
     */
    public static int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];
        Random rnd = new Random();

        for (int i = 0; i < longitud; i++) {
            int numeroAleatorio = rnd.nextInt(2, fin - 1);
            if (numeroAleatorio % 2 == 0) {

                t[i] = numeroAleatorio;

            } else if (numeroAleatorio < (fin - 1)) {
                t[i] = numeroAleatorio + 1;
            } else {
                t[i] = numeroAleatorio - 1;
            }
        }

        Arrays.sort(t);
        return t;

    }

}

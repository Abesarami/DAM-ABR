package ud5.bing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
        int jugadores = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al bingo");
        System.out.println("introduce el numero de jugadores:");
        jugadores = sc.nextInt();
        Jugador ArrayJugadores[] = new Jugador[jugadores];

        for (int i = 0; i < jugadores; i++) {
            System.out.println("Introduce el nombre del jugador numero " + i);
            String nombre = sc.nextLine();
            System.out.println("Introduce el numero de cartones del jugador numero " + i);
            int numeroCartones = sc.nextInt();
            ArrayJugadores[i] = new Jugador(nombre, numeroCartones);

            sc.nextLine();

            nombre = "";
            numeroCartones = 0;
        }
    }
}

class Jugador {
    String nombre = "";
    int numeroCartones = 0;

    public Jugador(String nombre, int numeroCartones) {
        this.nombre = nombre;
        this.numeroCartones = numeroCartones;
        carton[] cartones = new carton[numeroCartones];
        for (int i = 0; i < numeroCartones; i++) {
            cartones[i] = new carton();
        }
    }
}

class carton {
    static final int numCol = 5;
    static final int numFil = 3;
    int[][] numeros = new int[3][5];

    public carton() {
        numeros = matrizAleatoria(numFil, numCol, 1, 90);
    }

    public static int[][] matrizAleatoria(int x, int y, int min, int max) {
        int[][] t = new int[x][y];
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = rnd.nextInt(min, max + 1);
            }


        }
        return t;
    }
}
class maquinaBingo{
    int[] listaBolas = crearLista();
    public static int[] crearLista(){

        int[] listaBolas=new int[90];



        return listaBolas;

    }
    static Random rnd = new Random();
    int[] numeros = new int[0];
    public static int TirarBola(int[] numeros){
       int bola = rnd.nextInt(0, 90 + 1);
       numeros = Arrays.copyOf(numeros,numeros.length+1);
       numeros[numeros.length] = bola;
       Arrays.sort(numeros);
       if (Arrays.binarySearch(numeros,bola)!=1){
           bola = TirarBola(numeros);
       }


        return bola;
    }

}

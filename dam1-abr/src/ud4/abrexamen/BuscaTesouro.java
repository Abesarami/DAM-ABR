package ud4.abrexamen;

/*
 * Autor Antonio Besada Ramilo
 */
import java.util.*;

public class BuscaTesouro {
    public static void main(String[] args) {
        int porcentajeIntentos = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas filas quieres que sea el mapa");
        int filas = sc.nextInt();
        System.out.println("Y columnas?");
        int columnas = sc.nextInt();
        

        Random rnd = new Random();
        boolean ganador = false;
        int posiTesoroFila = rnd.nextInt(filas - 0 + 1) + 0;
        int posiTesoroColu = rnd.nextInt(columnas - 0 + 1) + 0;
        int intentos = (int) filas * columnas / porcentajeIntentos;
        if (intentos <= 3) {
            intentos = 3;
            
        }
        System.out.println("tendras el: "+porcentajeIntentos+"% de intentos aun que si son menos de 3 te dare 3");
        while (intentos > 0) {
            System.out.println("te quedan: "+intentos+" intentos");
            System.out.println("en que columna piensas que esta el tesoro?");
            int columnaUsuario = sc.nextInt();
            System.out.println("en que fila piensas que esta el tesor?");
            int filaUsuario = sc.nextInt();
            if (columnaUsuario <= columnas && filaUsuario <= filas) {
                if (filaUsuario == posiTesoroFila) {
                    if (columnaUsuario == posiTesoroColu) {
                        System.out.println("Felicidades has GANADO");
                        ganador = true;
                        intentos = 0;
                    } else {
                        if (columnaUsuario < posiTesoroColu) {
                            System.out.println("fallaste pero te dare una pista el tesoro esta hacia el norte");
                        } else {
                            System.out.println("fallaste pero te dare una pista el tesoro esta hacia el sur ");
                        }
                    }

                } else if (columnaUsuario == posiTesoroColu) {
                    if (filaUsuario < posiTesoroFila) {
                        System.out.println("fallaste pero te dare una pista el tesoro esta hacia el leste");
                    } else {
                        System.out.println("fallaste pero te dare una pista el tesoro esta hacia el oeste");
                    }

                } else if (filaUsuario < posiTesoroFila && columnaUsuario < posiTesoroColu) {
                    System.out.println("fallaste pero te dare una pista el tesoro esta hacia el nordés");

                } else if (filaUsuario < posiTesoroFila && columnaUsuario > posiTesoroColu) {
                    System.out.println("fallaste pero te dare una pista el tesoro esta hacia el sueste");
                } else if (filaUsuario > posiTesoroFila && columnaUsuario < posiTesoroColu) {
                    System.out.println("fallaste pero te dare una pista el tesoro esta hacia el noroeste");
                } else if (filaUsuario > posiTesoroFila && columnaUsuario > posiTesoroColu) {
                    System.out.println("fallaste pero te dare una pista el tesoro esta hacia el suroeste");
                }
                intentos = intentos-1;
            }else{
                System.out.println("error introduce un valor dentro de los margenes del mapa");
            }
        }
        if (ganador) {
            System.out.println("Has ganado cerrando programas");
        }else{
            System.out.println("se te han acabado los intentos y no has ganado la proxima sera");
        }
        sc.close();
    }
}

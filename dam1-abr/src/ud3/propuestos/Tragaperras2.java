package ud3.propuestos;

import java.util.Random;
import java.util.Scanner;

public class Tragaperras2 {
    public static void main(String[] args) {
        tragaperras2(100);
    }

    public static void tragaperras2(double dineroCuenta) {
        // Símbolos posibles en la tragaperras
        String[] simbolos = { "1", "2", "3", "7", "4", };
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido a la tragaperras!");
        System.out.println("Pulsa ENTER para jugar (o escribe 'salir' para terminar).");
        boolean seguir = true;
        while (seguir) {
            System.out.println(dineroCuenta);
            if (dineroCuenta > 0) {
                System.out.println("1- Jugar");
                System.out.println("2- Salir");
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Cuanto fichas quieres meter?");
                        int dinero = sc.nextInt();
                        if (dinero <= dineroCuenta) {
                            dineroCuenta = dineroCuenta - dinero;
                            // Generar los símbolos de las 3 ruedas
                            String ruedaArriba1 = simbolos[random.nextInt(simbolos.length)];
                            String ruedaArriba2 = simbolos[random.nextInt(simbolos.length)];
                            String ruedaArriba3 = simbolos[random.nextInt(simbolos.length)];
                            String rueda1 = simbolos[random.nextInt(simbolos.length)];
                            String rueda2 = simbolos[random.nextInt(simbolos.length)];
                            String rueda3 = simbolos[random.nextInt(simbolos.length)];
                            String ruedaAbajo1 = simbolos[random.nextInt(simbolos.length)];
                            String ruedaAbajo2 = simbolos[random.nextInt(simbolos.length)];
                            String ruedaAbajo3 = simbolos[random.nextInt(simbolos.length)];
                            // Mostrar el resultado
                            System.out.println("-------------");
                            System.out
                                    .println("| " + ruedaArriba1 + " | " + ruedaArriba2 + " | " + ruedaArriba3 + " |");
                            System.out.println("-------------");
                            System.out.println("-------------");
                            System.out.println("| " + rueda1 + " | " + rueda2 + " | " + rueda3 + " |");
                            System.out.println("-------------");
                            System.out.println("-------------");
                            System.out.println("| " + ruedaAbajo1 + " | " + ruedaAbajo2 + " | " + ruedaAbajo3 + " |");
                            System.out.println("-------------");
                            // Calcular el resultado
                            if (rueda1.equals(rueda2) && rueda2.equals(rueda3)) {
                                System.out.println("¡Jackpot!  ¡Has ganado con " + rueda1 + "!");
                                System.out.println("Tu dinero se a multiplicado por 7");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            } else if (rueda1.equals(ruedaArriba2) && ruedaArriba2.equals(rueda3)) {
                                System.out.println("¡Bien hecho! 3 símbolos coinciden. Felicidades!!");
                                System.out.println("Tu dinero se a multiplicado por 2");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            } else if (rueda1.equals(ruedaAbajo2) && ruedaAbajo2.equals(rueda3)) {
                                System.out.println("¡Bien hecho! 3 símbolos coinciden. Felicidades!!");
                                System.out.println("Tu dinero se a multiplicado por 2");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            } else if (rueda1.equals(ruedaArriba1) && ruedaArriba1.equals(ruedaAbajo1)) {
                                System.out.println("¡Bien hecho! 3 símbolos coinciden. Felicidades!!");
                                System.out.println("Tu dinero se a multiplicado por 2");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            } else if (ruedaArriba1.equals(rueda2) && rueda2.equals(ruedaArriba3)) {
                                System.out.println("¡Bien hecho! 3 símbolos coinciden. Felicidades!!");
                                System.out.println("Tu dinero se a multiplicado por 2");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            } else if (ruedaArriba1.equals(ruedaArriba2) && ruedaArriba2.equals(ruedaArriba3)) {
                                System.out.println("¡Bien hecho! 3 símbolos coinciden. Felicidades!!");
                                System.out.println("Tu dinero se a multiplicado por 2");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            }else if (ruedaArriba1.equals(rueda2) && rueda2.equals(ruedaAbajo3)) {
                                System.out.println("¡Bien hecho! 3 símbolos coinciden. Felicidades!!");
                                System.out.println("Tu dinero se a multiplicado por 2");
                                dineroCuenta = dineroCuenta + dinero * 2;
                            }else {
                                System.out.println("No hay suerte esta vez. Inténtalo de nuevo. ");
                                System.out.println("Tu dinero se a perdido");

                            }
                        } else {
                            seguir = false;
                            System.out.println("ERES UN TRAMPOSO");
                        }
                        break;
                    default:
                        seguir = false;
                        System.out.println("Cerrando Programa");
                        break;
                }
            } else {
                seguir = false;
                System.out.println("Cerrando Programa");
            }
        }
        sc.close();
    }
}
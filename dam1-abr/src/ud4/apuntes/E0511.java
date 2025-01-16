package ud4.apuntes;

import java.util.*;
import ud4.ArraysUtil;

public class E0511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de la camara secreta");
        System.out.println("En esta aplicacion tendras que adivinar la combinación para una camara secreta ");
        System.out.println("de cuantos digitos quieres hacerlo");
        int digitos = sc.nextInt();
        int[] contraseña = new int[digitos];
        contraseña = ArraysUtil.arrayAleatorio(digitos, 1, 5);
        int[] contraseñaUsuario = leerCombinacion(digitos);

        System.out.println("ahora introduce numeros del 1 al 5 y yo te dire si es mas menos o es ese numero");

        while (!Arrays.equals(contraseña, contraseñaUsuario)) {
            mostrarPistas(contraseña, contraseñaUsuario);

        }
        sc.close();
    }

    private static int[] leerCombinacion(int n) {
       Scanner sc = new Scanner(System.in);
       int[] combinación = new int[n];
       System.out.println("Introduce los "+n+ " dígitos de la combinacion");
       for(int i = 0; i< combinación.length;i++){
        combinación[i] = sc.nextInt();
       }
       sc.close();
        return combinación;
       
    }

    private static void mostrarPistas(int[] contraseña, int[] contraseñaUsuario) {
       int i;
        for(i = 0; i<contraseña.length ;i++ );
        if (contraseña[i]==contraseñaUsuario[i]) {
            System.out.print("=");
            
        }else if (contraseña[i]>contraseñaUsuario[i]) {
            System.out.print(">");
            
        }else{
            System.out.print("<");
        }
    }
}

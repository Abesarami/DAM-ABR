package ud4.apuntes;

import java.util.Scanner;
import ud4.ArraysUtil;

public class JuegoContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        boolean acertasete = false;
        System.out.println("introduzca la contraseña");
        String contraseña = sc.nextLine();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        while (acertasete == false && contador<3) {
            System.out.println("adivina");  
            String adivina = sc.nextLine();
            contador = contador +1;
            acertasete =ArraysUtil.ComparadorStrings(contraseña, adivina);
        }
        if (acertasete) {
           System.out.println("felicidades"); 
        }else{
            System.out.println("das pena");
        }
        
        
    }
}

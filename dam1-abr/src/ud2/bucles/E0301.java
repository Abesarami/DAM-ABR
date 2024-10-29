package ud2.bucles;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        
        int num1;
        System.out.println( "En este programa te dire si tu numero es positivo o negatico si es par y su cuadrado, el proceso se repetira hasta que el numero sea 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero");
        num1 = sc.nextInt();
        
        while (num1 != 0) {
            if (num1%2 == 0) {
                System.out.println("tu numero es par");
                
            }
            else{
                System.out.println("Tu numero no es par");
            }
            if (num1 < 0 ) {
                System.out.println("tu numero es negativo");

            }
            else{
                System.out.println("Tu numero no es negativo");

            }
            System.out.println("El cuadrado de tu numero es"+ num1*num1);
            System.out.println("Introduce otro numero si deseas cerrar el programa escribe 0");
            num1 = sc.nextInt();
        }
    }


}

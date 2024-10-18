package ud1.ejercicios;

import java.util.Scanner;

/**
 * EP0113
 */
public class EP0113 {

    public static void main(String[] args) {
        double a,b,c,x;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a b c x en este mismo orden");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        x = sc.nextDouble();

        System.out.println("tus numeros son  a ="+a+" b = "+b+" c = "+c+" x = "+x);

        double y = a*(Math.pow(x, 2)) + b * x + c ;
         
        System.out.println(y);
        sc.close();
    }
}
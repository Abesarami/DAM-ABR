package ud2.ejemplos;

import java.util.*;
public class JuegoSuma {
    public static void main(String[] args) {
     System.out.println("Bienvenido al juego de la suma");
     System.out.println("Tienes que sumar estos dos numeros si aciertas habras ganado 1 aplauso");
     int min=1;
     int MAX=99;
     double num1,num2;
     num1 =(int) (Math.random() * min);
     num1 =(int) (Math.random() *   (MAX - min + 1)) + min ;
    }
}

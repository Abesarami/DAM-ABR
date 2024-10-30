package ud2.ejemplos;

import java.util.*;

public class JuegoMates {
   public static void main(String[] args) {
      System.out.println("Bienvenido al juego de la suma");
      System.out.println("Tienes que sumar estos dos numeros si aciertas habras ganado 1 aplauso");
      int min = 1;

      int MAX = 99;
      int NumeroUsu;
      boolean sigue = true;
      int num1, num2;
      do {

         num1 = (int) (Math.random() * (MAX - min + 1)) + min;
         num2 = (int) (Math.random() * (MAX - min + 1)) + min;
         Scanner sc = new Scanner(System.in);

         System.out.printf("Escribe el resultado de la suma entre %d y %d ", num1, num2);
         NumeroUsu = sc.nextInt();

         if (NumeroUsu == num1 + num2) {
            System.out.println("Felicidades has acertado");

         } else {
            System.out.println("Has fallado Skill Issue de esa");
            sigue = false;
            sc.close();

         }

      } while (sigue == true);

   }

}

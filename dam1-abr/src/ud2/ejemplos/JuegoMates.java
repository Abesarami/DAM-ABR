package ud2.ejemplos;

import java.time.LocalTime;
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
         LocalTime horainicial = LocalTime.now();
         System.out.printf("Escribe el resultado de la suma entre %d y %d ", num1, num2);
         NumeroUsu = sc.nextInt();
         LocalTime horafinal = LocalTime.now();

         if (NumeroUsu == num1 + num2) {
            System.out.println("Felicidades has acertado");
            System.out.println("Has tardado"+(horafinal.toSecondOfDay()-horainicial.toSecondOfDay()) );

         } else {
            System.out.println("Has fallado Skill Issue de esa");
        System.out.println("Has tardado"+(horafinal.toSecondOfDay()-horainicial.toSecondOfDay())+" Segundos" );

            sigue = false;
            sc.close();

         }

      } while (sigue == true);

   }

}

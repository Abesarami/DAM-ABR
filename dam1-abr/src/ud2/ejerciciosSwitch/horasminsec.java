package ud2.ejerciciosSwitch;

/* Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual (10:41:59) => hora actual + 1 segundo (10:42:00)
*/
import java.util.*;

public class horasminsec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1, minutos1, segundo1;
        System.out.println("Introduce la hora");
        int hora = sc.nextInt();
        System.out.println("Introduce minutos");
        int minutos = sc.nextInt();
        System.out.println("Introduce segundos");
        int segundo = sc.nextInt();
        sc.close();
        segundo1 = segundo + 1;
        hora1 = hora + 1;
        minutos1 = minutos + 1;

        if (segundo + 1 == 60) {
            segundo1 = 00;
            if (minutos + 1 == 60) {
                minutos1 = 00;
                if (hora + 1 == 24) {
                    hora1 = 00;

                }

            }

        }

        System.out.println("Has introducido las:" + hora + ":" + minutos + ":" + segundo);

        System.out.println("si le sumamos una hora seran las: " + hora1 + ":" + minutos1 + ":" + segundo1);

    }
}

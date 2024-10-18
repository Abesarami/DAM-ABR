package ud1.ejercicios.abr20241004;
import java.util.Scanner;

public class EPO116 {

    public static void main(String[] args) {

        double mm;
        double cm;
        double m;


        Scanner sc = new Scanner(System.in);
        System.out.println("Hola en este programa convertiremos y sumaremos 3 medidas de longitud y te lo presentare en cm");
        System.out.println("La primera en mm");
        mm = sc.nextDouble();
        System.out.println("El segundo en cm");
        cm = sc.nextDouble();
        System.out.println("La tercera en m");
        m = sc.nextDouble();
        System.out.println("La suma de tus 3 medidas es"+(mm/10)+(cm)+(m*100)+"cm");
        sc.close();
    }
}

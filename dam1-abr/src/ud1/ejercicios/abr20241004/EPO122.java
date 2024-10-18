package ud1.ejercicios.abr20241004;

import java.util.Scanner;

public class EPO122 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double far, cel;
        System.out.println(
                "Hola, en este programa convertiremos de farenheit a celsius introduce tus grados en farenheit");
        far = sc.nextDouble();
        cel = 5/9.0 * (far - 32);
        System.out.println("Estes son tus grados en celsius"+ cel+" lo que en farenheit es: "+ far );
        sc.close();
    }
}

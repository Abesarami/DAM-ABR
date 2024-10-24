package ud1.abrexamen;

/*
 * 
 * Antonio Besada Ramilo
 */
import java.util.Scanner;

public class compras {
    public static void main(String[] args) {
        double amigo1, amigo2, amigo3;
        boolean SePuedeComprar;
        Scanner sc = new Scanner(System.in);
        String ResultadoFinal;
        System.out.println("Introduce el dinero que cuesta el articulo que quereis comprar");
        double precio = sc.nextDouble();

        System.out.println("Ok ahora introduce el dinero que teneis en euros cada uno encima");
        amigo1 = sc.nextDouble();
        amigo2 = sc.nextDouble();
        amigo3 = sc.nextDouble();
        sc.close();
        double bote = amigo1 + amigo2 + amigo3;

        System.out.println("teneis entre todos:" + bote);

        SePuedeComprar = precio < bote ? true : false;
        double dinero = SePuedeComprar ? bote - precio : precio - bote;
        ResultadoFinal = SePuedeComprar ? "Si que se puede comprar y os sobran %.2f"
                : "No que se puede comprar y os faltan %.2f";

        System.out.printf(ResultadoFinal, dinero);

    }
}

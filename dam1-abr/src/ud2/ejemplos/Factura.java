package ud2.ejemplos;
import java.util.*;
public class Factura {
    public static void main(String[] args) {
        System.out.println("Introduce el precio y la cantidad de producto");
        Scanner sc = new Scanner(System.in);
        double preciso = sc.nextDouble();
        double cantidad = sc.nextDouble();
        double total = preciso*cantidad;
        double IVa= total*0.21;
        double totalIva= total+IVa;
        double preciodescuento=  totalIva - (totalIva * 0.05) ;
        if (totalIva >= 100) {
            System.out.println("Tienes que pagar: "+preciodescuento+" EUROS");
        }
        else{
            System.out.println("Tienes que pagar: "+totalIva+" EUROS");
        }
        sc.close();
    }
}

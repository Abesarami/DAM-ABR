package ud2.ejercicios.abr20241118;
/*
 * 1. Supermercado
Supermercado.java
Implementa un programa que simule el proceso de cobro en la caja de un supermercado.
1. Para calcular el importe total que debe pagar cada cliente el programa solicitará
introducir el precio de cada producto, expresado en euros con hasta 2 decimales, y
la cantidad de unidades del mismo, expresado como un número entero.
2. El programa deberá controlar los posibles errores o excepciones en la entrada de
datos por teclado, informando al usuario y permitiendo repetir la entrada.
3. La condición para finalizar la introducción de productos queda a criterio del
programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.
4. Una vez terminado de introducir los productos, el programa mostrará el importe total
de la compra y solicitará al usuario el medio de pago elegido por el cliente: “con
tarjeta” o “en efectivo”.
5. Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de
ese cliente.
6. Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe
pagado por el cliente y se calculará el cambio a devover, desglosando dicha
cantidad en billetes y monedas de € y de 1 céntimos de euro.
7. Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir
el proceso para un nuevo cliente.
Implementa el programa utilizando programación modular para descomponer el problema
en subproblemas más sencillos implementados con funciones
 * 
 * 
 * 
 */
import java.util.*;
public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double CINCUENTA = 50;
        final double VEINTE = 20;
        final double DIEZ = 10;
        final double CINCO = 5;
        double precioArticulo = 0;
        double precioPagar = 0;
        int cantidad = 0;
        int opcion;
        while (precioArticulo != -1) {
         System.out.println("introduce el dinero que cuesta el articulo");
            precioArticulo = sc.nextDouble();
        if ((precioArticulo * 100) %1 ==0) {
            
            System.out.println("Ahora introduce la cantidad");
          cantidad = sc.nextInt();
            precioPagar = precioPagar + (precioArticulo*cantidad);
            System.out.println("su total es "+precioPagar+" introduzca -1 para pasar a la ventana de pagar");
    
            
       
        }else{
             System.out.println(" ERROR COMPRUEBA SI Has introducido mas de 2 decimales cerrando programa");
        break;
           
        }
       
        }
        System.out.println("con efectivo(1) o tarjeta(2)?");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
            System.out.println("su importe es de "+precioPagar);
            



System.out.print("Introduce el importe que entrega el cliente ");
double dineroCliente = sc.nextInt();
double vuelta = precioPagar-dineroCliente;
sc.close();




double b50 = (int)vuelta/CINCUENTA;
vuelta = vuelta%CINCUENTA;

double b20 = (int)vuelta/VEINTE;
vuelta = vuelta%VEINTE;

double b10 =  (int)vuelta/DIEZ;
vuelta = vuelta%DIEZ;

double b5 =  (int)vuelta/CINCO;
vuelta =vuelta%CINCO;

double m2 = (int) vuelta/2;
vuelta =vuelta%2;

double m1 = (int) vuelta/1;
vuelta = vuelta%1;

double c50 =  (int)vuelta/0.50;
vuelta = vuelta%0.50;

double c20 =  (int)vuelta/0.20;
vuelta = vuelta%0.20;

double c10 =  (int)vuelta/0.10;
vuelta = vuelta%0.10;

double c5 = (int) vuelta/0.5;
vuelta = vuelta%0.5;

double c2 = (int) vuelta/0.2;
vuelta = vuelta%0.2;

double c1 = (int) vuelta/0.1;
vuelta = vuelta%0.1;


System.out.println("tu vuelta es"+b50+""+b20+""+b10+""+b5+""+m2+""+m1+""+c50+""+c20+""+c10+""+c5+""+c2+""+c1);



                break;
            case 2:
            System.out.println("su importe es de "+precioPagar);
            System.out.println("introduzca tarjeta");
            System.out.println("muchas gracias por su compra");
                break;
            default:
                break;
        }
    
    }
}

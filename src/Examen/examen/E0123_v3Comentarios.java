/* 
Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
    1 kilogramo = 1000 gramos
    1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */
package Examen.examen;


import java.util.Scanner;

public class E0123_v3Comentarios {
    public static void main( String[] args ) {


        Scanner sc = new Scanner(System.in); // Creamos una instancia de clase Scanner, es necesario para poder usar los métodos de la clase Scanner
        //sc.useLocale(Locale.US); // <---- Esto a mi no me funciona

        double c;  // Cantidad de la unidad de masa, necesita ser doble para los decimales de las conversiones.
        String u;  // unidad de medida

        final double GRAMOS_EN_LIBRAS  = 453.592f;  // Cantidad de gramos en una Libras
        final int    GRAMOS_EN_KILOS   = 1000;      // Cantidad de gramos en un Kilo


        boolean isKilos = false;

        System.out.print("Introduce una unidad de masa entre Kilos y libras y una cantidad de masa para su conversión a gramos");

        /* Otra solución sería introducir un número para distinguir las unidades, aunq deberemos cambiar el tipo de variable a uno que soporte números (byte,int,long...)  
        Por ejemplo, si introducen 0 sería Kilos y si introducen 1 sería Libras */
        System.out.print("Introduce k para Kilos y l para Libras"); 
        u = sc.nextLine();

        // Usamos el operador or (||) para la condición haciendole saber que nos vale cualquiera de las siguientes Strings: "k", "K", "kg", "Kg", "lb", "Lb"
        // Si se introdujo alguna de las anteriores Strings, el valor de isKilos sera True de lo contrario False, esto permite hacer la comparación más rápida al tener solo que comprar 1 bit en vez de la String que puede llegar a ser muy grande.
        // Hay mejores formas de hacer esto, pero es por usar lo que nos enseñaron.
        isKilos = u.equals("k") || u.equals("K")|| u.equals("kg") || u.equals("Kg") || u.equals("lb") || u.equals("Lb")? true:false;

        System.out.println("Introduce una cantidad");
        c = sc.nextDouble();
        sc.close();

        /* 
        La siguiente linea de código contiene un operador ternario y tiene la siguiente estructura:
            variable = condicion ? valorSiVerdadero : valorSiFalso;

        Los valores se colocan tras la '?' y separados por ':' ( se pueden encadenar varios operadores ternarios para tener más de dos valores ).
        Nuestros valores son:  m*1000 : m*453.592;
        Nuestra condición es isKilos, que puesta asi por defecto es lo mismo que preguntar: (isKilos == true)           */
        
        // Comprobamos si isKilos es igual a True y escogemos la conversión adecuada
        c = isKilos ? c*GRAMOS_EN_KILOS : c*GRAMOS_EN_LIBRAS;                     // Conversión a gramos

        String uNombreCorto = isKilos ? "lb" : "kg";                              // Letra de la unidad a la que se va a convertir
        String uNombreLargo = isKilos ? "libras" : "kilos";                       // Nombre de la completo de la unidad a la que se va a convertir
        double cResultado   = isKilos ? c/GRAMOS_EN_LIBRAS : c/GRAMOS_EN_KILOS;   // Conversión de gramos a la unidad opuesta a la introducida
        
        // print formateado 
        // %s Introduce una String
        // %f Introduce un valor decimal, el valor decimal convinado con el .2 permite mostar tan solo 2 decimales
        // %n Introduce una nueva linea
        // Estas "etiquetas" o placeholders se sustituyen por los valores a continuación del literal de String en nuestro caso "El resultado en %s es: %.2f%s%n".
        // Las etiquetas son sustituidas secuencialmente usando las variables separadas por comas como se ve a continuación.
        System.out.printf("El resultado en %s es: %.2f%s%n",uNombreLargo,cResultado,uNombreCorto);

        

    }
}

package ud2.bucles;
/*
 * 
 * EP0311_Decimal_Binario. Realiza un programa que convierta un número entero decimal
en su representación binaria. Hay que tener en cuenta que desconocemos cuántas cifras
tiene el número que introduce el usuario.
Por simplicidad, iremos mostrando el número binario con un digito por línea.

 */
import java.util.*;
public class transformaraBinario {
    public static void main(String[] args) {
        int n;
        String binario = "";
        System.out.println("Introduce un numero para pasarlo a binario :)");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        sc.close();
        while (n > 0) {
            binario = (n%2) + binario ;
            n= n/2;
            
        }
        System.out.println(binario);
    }
}

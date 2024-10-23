package ud2.ejerciciosSwitch;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos).
*
*/
import java.util.*;
public class E0212 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dia y mes y te dire si es correcta");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        sc.close();

        switch (mes) {
            case 2:
                if (dia <=28) {
                    System.out.println("tu dia es valido");
                    
                }
                else{
                    System.out.println("tu dia no es valido");
                }
                break;
                case 4,6,9,11:
                if (dia<31) {
                    System.out.println("tu dia es valido");
                }
                break;
            default: 
            if (dia <=31) {
                System.out.println("tu dia es valido");
                
            }
            else {
                System.out.println("tu dia no es valido");
            }
                break;
        }
    }
}

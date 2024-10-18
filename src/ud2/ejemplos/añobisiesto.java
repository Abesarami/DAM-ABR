package ud2.ejemplos;
import java.util.*;
public class añobisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un año y te dire si es bisiesto");
        int año = sc.nextInt();
        if ((año%4) == 0 || (año%400) == 0) {
            System.out.println("tu año es bisiesto");
            
        }
        else{
            System.out.println("tu año no es bisiesto");
        }
    }
}

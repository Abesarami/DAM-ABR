package ud4.apuntes;
import java.util.*;

public class EsCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("introduce caracter");
        String caracter;
        caracter = sc.next();
        char[] t = caracter.toCharArray();

        if (Character.isLetter(t[0])) {
            if (Character.isUpperCase(t[0])) {
                System.out.println("Es una letra Mayuscula "+"La minuscula es "+Character.toLowerCase(t[0]));
            }else{
                System.out.println("Es una letra minuscula "+"La mayuscula es "+Character.toUpperCase(t[0]));
            }    
        }else{
            if (Character.isDigit(t[0])) {
                System.out.println("Es un digito");
            }else{

                System.out.println("error");
            }
        }


    }
}

package ud2.ejercicios.abr20241118;

import java.util.*;



public class ejercicio {
    public static void main(String[] args) {
        System.out.println("En este programa calcularemos tu imc");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg");
        double kg = sc.nextDouble();
        System.out.println("Y ahora tu altura en centimetros");
        double cm = sc.nextDouble();
        sc.close();
        System.out.println( imc(kg,cm));
    }

public static String imc(double kg, double cm){
    String resultado="";
   double IndiceDeMasaCorporal = kg /  Math.pow(cm,2);
   if (IndiceDeMasaCorporal<18.50) {
    resultado = "Bajo Peso";
    
   }
   else
   if (IndiceDeMasaCorporal<25) {
    resultado="Normal";
    
   }
   else
   if (IndiceDeMasaCorporal>=25) {
    if (IndiceDeMasaCorporal>=30) {
        resultado = "obesidad";
        
    }
    else{
        resultado = "Sobrepeso";
    }
    
   }else{
    System.out.println("?¿?¿?¿?¿¿?¿?¿¿??¿??¿¿??¿?¿¿¿??¿?¿¿??¿?¿?¿?");
   }
    
    return resultado;
}
}

package ud4.apuntes;
import java.util.*;
public class FraseMasLarga {

public static void main(String[] args) {
    
    }
    
    public static String FraseMasCorta(String a, String b) {
        String respuesta;
        char[] tablaa = a.toCharArray();
        char[]  tablab = b.toCharArray();

        if (tablaa.length<tablab.length) {
            respuesta = "La frase mas corta es la primera";
        }else if (tablaa.length>tablab.length) {
             respuesta = "La frase mas corta es la segunda";
           
        }else{
            respuesta = "son iguales";
        }


return respuesta;
        
    }


}

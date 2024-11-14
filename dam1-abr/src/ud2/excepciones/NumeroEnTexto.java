package ud2.excepciones;
import ud2.Util;

public class NumeroEnTexto {
    public static void main(String[] args) {
        
        for(int n = 1; n<=99; n++ ){

            System.out.println(n + "."+ Util.numeroText(n));
        }
    }
    
}

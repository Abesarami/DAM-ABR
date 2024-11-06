package ud2;


public class Util {
    
    

    static boolean esPar(int n) {
        return n % 2 == 0;
       

    }

    static int mayor(int a, int   b ){
        int mayor =  a > b ? a : b;
        return mayor; 

    }

    static boolean bisiesto (int n){
        if (n%4==0 || n%100 == 0 && n%400==0) {
            return true;
            
        }
        else{
            return false;
        }
            
    }
    
}

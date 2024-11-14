package ud2;

import java.util.Scanner;

public class Util {

    public  static boolean esPar(int n) {
        return n % 2 == 0;

    }

    public  static int mayor(int a, int b) {
        int mayor = a > b ? a : b;
        return mayor;

    }

    public static boolean bisiesto(int n) {
        if (n % 4 == 0 || n % 100 == 0 && n % 400 == 0) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean casiCero(double n) {
        if (n > -1 && n < 1 && n != 0) {
            return true;
        } else {
            return false;
        }

    }
    public static String numeroText(int n){


String cUnits ="";
String cTens ="";

if (n > 9) {
switch (n) {
case 10: cTens = "diez"; break;
case 11: cTens = "once"; break;
case 12: cTens = "doce"; break;
case 13: cTens = "trece"; break;
case 14: cTens = "catorce"; break;
case 15: cTens = "quince"; break;
case 16: cTens = "dieciséis"; break;
case 17: cTens = "diecisiete"; break;
case 18: cTens = "dieciocho"; break;
case 19: cTens = "diecinueve"; break;
case 20: cTens = "veinte"; break;
case 30: cTens = "treinta"; break;
case 40: cTens = "cuarenta"; break;
case 50: cTens = "cincuenta"; break;
case 60: cTens = "sesenta"; break;
case 70: cTens = "setenta"; break;
case 80: cTens = "ochenta"; break;
case 90: cTens = "noventa"; break;

default:
switch (n/10) {
case 2: cTens = "veinti"; break;
case 3: cTens = "treinta y "; break;
case 4: cTens = "cuarenta y "; break;
case 5: cTens = "cincuenta y "; break;
case 6: cTens = "sesenta y "; break;
case 7: cTens = "setenta y "; break;
case 8: cTens = "ochenta y "; break;
case 9: cTens = "noventa y "; break;
}
break;
}
}

if ( n/10 != 1 && n%10 != 0 ) {

switch (n%10) {
case 1: cUnits = "uno"; break;
case 2: cUnits = "dos"; break;
case 3: cUnits = "tres"; break;
case 4: cUnits = "cuatro"; break;
case 5: cUnits = "cinco"; break;
case 6: cUnits = "seis"; break;
case 7: cUnits = "siete"; break;
case 8: cUnits = "ocho"; break;
case 9: cUnits = "nueve"; break;
}
}
String resultado = cTens+cUnits;
return resultado;

}
    

    public static String notatexto(double n) {
        String nota;
        if (n < 5) {
            nota = "Insuficiente";

        } else if (n < 6) {
            nota = "Suficiente";

        } else if (n < 7) {
            nota = "bien";

        } else if (n < 9) {
            nota = "Notable";

        } else if (n <= 10) {
            nota = "sobresaliente";
        } else {
            nota = "nota incorrecta";
        }

        return nota;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        sc.close();
        System.out.println(notatexto(n));
    }
    public static void  imprimirtexto(int n){

        for (int i = 1; i <= n + 4; i++){ //borde de abajo
            System.out.print("#"); 
        
       }
       System.out.println();
       
    }
}

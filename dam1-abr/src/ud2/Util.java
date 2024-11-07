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

        System.out.println(notatexto(n));
    }

}

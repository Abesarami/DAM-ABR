package ud4.stringsapuntes;

import java.util.Arrays;
import java.util.Scanner;

public class E0612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el la primera palabra: ");
        String palabra1= sc.nextLine();

        System.out.println("Introduce el la segunda palabra: ");
        String palabra2= sc.nextLine();
        System.out.println(sonAnagramas(palabra1,palabra2));
    }

    private static boolean sonAnagramas(String palabra1,String palabra2) {

        boolean anagrmas = false;
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();


        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1,array2)){
            anagrmas = true;


        }

        return anagrmas;
    }
}

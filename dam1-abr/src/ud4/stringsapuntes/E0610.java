package ud4.stringsapuntes;

import java.util.Scanner;

public class E0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        if (esPalindromo(frase))
            System.out.println("Es Palíndromo");
        else
            System.out.println("No es Palíndromo");
    }

    private static boolean esPalindromo(String frase) {
        String fraseSinEspacios = sinEspacios(frase);
        String fraseInvertidaSinEspacios = invertirSinEspacios(frase);

        return fraseSinEspacios.equalsIgnoreCase(fraseInvertidaSinEspacios);
    }

    static String invertirSinEspacios(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >=0 ; i--) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra != ' ') {
                letra = switch (letra) {
                    case 'á' -> 'a';
                    case 'é' -> 'e';
                    case 'í' -> 'i';
                    case 'ó' -> 'o';
                    case 'ú' -> 'u';
                    default -> letra;
                };
                fraseInvertida += letra;
            }

        }
        return fraseInvertida;
    }

    static String sinEspacios(String frase) {
        String fraseSinEspacios = "";
        for (int i = 0; i < frase.length() ; i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra != ' ') {
                switch (letra) {
                    case 'á': letra = 'a'; break;
                    case 'é': letra = 'e'; break;
                    case 'í': letra = 'i'; break;
                    case 'ó': letra = 'o'; break;
                    case 'ú': letra = 'u'; break;
                }
                fraseSinEspacios += letra;
            }
        }
        return fraseSinEspacios;
    }

}

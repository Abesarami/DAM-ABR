package ud4.stringsapuntes;

import java.util.Scanner;

public class E0611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un cofigo de codificación: ");
        String frase = sc.nextLine();
        System.out.println("Introduzca el segundo cofigo de codificación: ");
        String frase2 = sc.nextLine();
        System.out.println("Introduzca la palabra que quieres codificar ");
        String fraseCodificar = sc.nextLine();
        System.out.println(codifica(frase, frase2, fraseCodificar));
    }


    static String codifica(String frase, String frase2, String fraseCodificar) {
        String codificada = "";
        for (int i = 0; i < fraseCodificar.length(); i++) {
            char letra = Character.toLowerCase(fraseCodificar.charAt(i));
            for (int j = 0; j < frase.length(); j++) {
                char letraAntes = frase.charAt(j);
                char letraDespues = frase2.charAt(j);
                if (letra == letraAntes) {
                    letra = letraDespues;
                    break;
                }

            }


            codificada += letra;

        }
        return codificada;
    }

}

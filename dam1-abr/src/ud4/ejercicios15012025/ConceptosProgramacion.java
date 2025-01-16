package ud4.ejercicios15012025;

import java.util.Random;

public class ConceptosProgramacion {

    public static void main(String[] args) {
        String[] t = {
                "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto" };

        System.out.println(fraseAleatoria(t));
    }

    static String fraseAleatoria(String[] t) {
        String frase;
        Random rnd = new Random();
        frase = t[rnd.nextInt(t.length)];

        return frase;
    }
}

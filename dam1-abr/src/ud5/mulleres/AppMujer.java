package ud5.mulleres;

import java.util.Arrays;

public class AppMujer {
    public static void main(String[] args) {
        // Instanciación de mulleres destacadas
        Cientifica marieCurie = new Cientifica("Marie",  1867,"Curie", "Descubriu o radio e o polonio");
                Artista fridaKahlo = new Artista("Frida",  1907,"Kahlo", "Surrealismo e pintura autobiográfica");
                Politica rosaParks = new Politica("Rosa",  1913,"Parks", "Loita polos dereitos civís e contra a segregación racial");
                Cientifica adaLovelace = new Cientifica("Ada",  1815,"Lovelace", "Primeira programadora da historia");
                // Array de Mulleres Traballadoras Destacadas
                MullerTraballadora[] mulleres = {marieCurie, fridaKahlo, rosaParks, adaLovelace};
        for (int i = 0; i < mulleres.length; i++) {
            System.out.println(mulleres[i].toString());
        }
}

}

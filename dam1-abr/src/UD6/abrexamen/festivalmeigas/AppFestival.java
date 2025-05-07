package UD6.abrexamen.festivalmeigas;
//autor Antonio Besada Ramilo

import java.util.*;

public class AppFestival {

    public static void main(String[] args) {

        Map<String, String> MapaMeigas = new TreeMap();
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        Arrays.sort(meigasExemplo);
        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");

            MapaMeigas.put(puntos + " puntos a meiga: " + meiga.getNome(), meiga.getAlcume());


        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        for (Map.Entry<String, String> entry : MapaMeigas.entrySet()) {  //ESTO ES UN FOREACH

            System.out.println(" con: " + entry.getKey() + "(" + entry.getValue() + ")");
        }

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}

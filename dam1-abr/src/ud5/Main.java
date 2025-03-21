package ud5;

import java.util.*;

class Pregunta {
    private String enunciado;
    private List<String> respuestas;
    private int indiceCorrecto;

    public Pregunta(String enunciado, List<String> respuestas, int indiceCorrecto) {
        if (respuestas == null || respuestas.size() < 2) {
            throw new IllegalArgumentException("Debe haber al menos dos respuestas.");
        }
        if (indiceCorrecto < 0 || indiceCorrecto >= respuestas.size()) {
            throw new IllegalArgumentException("Índice de respuesta correcta fuera de rango.");
        }
        this.enunciado = enunciado;
        this.respuestas = new ArrayList<>(respuestas);
        this.indiceCorrecto = indiceCorrecto;
    }

    public boolean corregir(int indice) {
        return indice == indiceCorrecto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(enunciado + "\n");
        char letra = 'a';
        for (String respuesta : respuestas) {
            sb.append(letra).append(") ").append(respuesta).append("\n");
            letra++;
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pregunta otra = (Pregunta) obj;
        return enunciado.equals(otra.enunciado) && respuestas.equals(otra.respuestas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado, respuestas);
    }
}

class Examen {
    private String titulo;
    private Set<Pregunta> preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
        this.preguntas = new HashSet<>();
    }

    public void addPregunta(Pregunta pregunta) {
        if (!preguntas.add(pregunta)) {
            System.out.println("La pregunta ya está en el examen.");
        }
    }

    public int numPreguntas() {
        return preguntas.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Examen: " + titulo + "\n");
        int num = 1;
        for (Pregunta pregunta : preguntas) {
            sb.append(num++).append(". ").append(pregunta.toString()).append("\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> opciones = Arrays.asList("Madrid", "Barcelona", "Sevilla", "Valencia");
        Pregunta p1 = new Pregunta("¿Cuál es la capital de España?", opciones, 0);
        Pregunta p2 = new Pregunta("¿Cuál es la capital de Francia?", Arrays.asList("París", "Londres", "Berlín"), 0);

        Examen examen = new Examen("Geografía");
        examen.addPregunta(p1);
        examen.addPregunta(p2);
        examen.addPregunta(p1); // Intento de añadir una pregunta repetida

        System.out.println(examen);
    }
}
package UD6.FestivalDasMeigas;

//public class Feitizo {
//   private String Nome;
//   private String Dificultad;
//   private String Creador;
//
//    public Feitizo(String nome, String dificultad, String creador) {
//        Nome = nome;
//        Dificultad = dificultad;
//        Creador = creador;
//    }
//
//    public String getCreador() {
//        return Creador;
//    }
//
//    public void setCreador(String creador) {
//        Creador = creador;
//    }
//
//    public String getDificultad() {
//        return Dificultad;
//    }
//
//    public void setDificultad(String dificultad) {
//        Dificultad = dificultad;
//    }
//
//    public String getNome() {
//        return Nome;
//    }
//
//    public void setNome(String nome) {
//        Nome = nome;
//    }
//}

import java.util.*;

public class Feitizo {
    private String nome;
    private String[] ingredientes;
    private int dificultad;


    public Feitizo(String nome, String[] ingredientes, int dificultad) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.dificultad = dificultad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public static Feitizo[] crearFeitizosExemplo() {
        String[] ingredientes1 = {"auga de río encantada", "pétalos de rosa silvestre", "fume de lareira"};
        String[] ingredientes2 = {"auga do mar", "salicornia", "berberechos místicos"};
        String[] ingredientes3 = {"raíz de toxo", "auga bendita", "po de estrela fugaz"};
        String[] ingredientes4 = {"auga de río encantada", "raíz de toxo", "pel de serpe"};
        String[] ingredientes5 = {"auga do mar", "po de estrela fugaz", "cinza de bidueiro"};
        String[] ingredientes6 = {"auga bendita", "pétalos de rosa silvestre", "brétema das fragas"};

        Feitizo f1 = new Feitizo("Encantamento da Chuvia Mansa", ingredientes1, 3);
        Feitizo f2 = new Feitizo("Invocación Mariña", ingredientes2, 4);
        Feitizo f3 = new Feitizo("Luz do Luar", ingredientes3, 2);
        Feitizo f4 = new Feitizo("Garda da Fraga", ingredientes4, 3);
        Feitizo f5 = new Feitizo("Respiro Oceánico", ingredientes5, 4);
        Feitizo f6 = new Feitizo("Bendición Floral", ingredientes6, 2);

        return new Feitizo[]{f1, f2, f3, f4, f5, f6};
    }

    public static Collection<String> ingredientesUnicos(Collection<Feitizo> feitizos) {
        Set<String> ingredientesUnicos = new TreeSet<>();
        for (Feitizo feitizo : feitizos) {
            for (String i : feitizo.ingredientes) {
                ingredientesUnicos.add(i);
            }
        }
        return ingredientesUnicos;
    }

    public static List<Feitizo> feitizosPosibles(Set<String> ingredientes, Feitizo[] f) {
        List<Feitizo> posibles = null;

        for (int i = 0; i < crearFeitizosExemplo().length; i++) {
            if (ingredientes.containsAll(Arrays.asList(f[i].getIngredientes()))) {
                posibles.add(crearFeitizosExemplo()[i]);
            }
        }

        return posibles;
    }

    public static Map<String, Integer> ingredientesVecesUsados(Collection<Feitizo> feitizos) {
        Map<String,Integer> Contador =null;
        for (int i = 0; i < feitizos.size(); i++) {
         
        }
        
        return null;
    }
    

}

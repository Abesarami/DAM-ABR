package UD6.FestivalDasMeigas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import repaso.repaso;

public class Meiga {
    private String Nome = "";
    private String AlcumeMaxicos = "";
    // private Feitizo[] FeitizosFav;
    private Set<Feitizo> Feitizos;
    private Map<String, Integer> inventario;

    public Meiga(String nome, String alcumeMaxicos, Collection<Feitizo> feitizos, Map<String, Integer> inventario) {
        Nome = nome;
        AlcumeMaxicos = alcumeMaxicos;
        feitizos = Feitizos;
        this.inventario = inventario;
    }

    public void setFeitizos(Set<Feitizo> feitizos) {
        Feitizos = feitizos;
    }

    public Map<String, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public Meiga(String nome, String alcumeMaxicos) {
        Nome = nome;
        AlcumeMaxicos = alcumeMaxicos;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAlcumeMaxicos() {
        return AlcumeMaxicos;
    }

    public void setAlcumeMaxicos(String alcumeMaxicos) {
        AlcumeMaxicos = alcumeMaxicos;
    }

    public Set<Feitizo> getFeitizos() {
        return Feitizos;
    }

    // metodos
    private static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizosExemplo) {
       
        List<Feitizo> lista = new ArrayList<>(feitizosExemplo);
        Collections.shuffle(lista);
        
        Set<Feitizo> devolucion = new HashSet<>();
        Iterator<Feitizo> it = lista.iterator();
        int i = 0;
        while (it.hasNext() && i < 5 ) {
            devolucion.add(it.next());
            i++;
            
        }
        return devolucion;
    }

    private static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientesExemplo, int i) {

        List<Feitizo> lista = new ArrayList<>(ingredientesExemplo);
        Collections.shuffle(lista);
        
        Set<Feitizo> devolucion = new HashSet<>();
        Iterator<Feitizo> it = lista.iterator();
        int i = 0;
        while (it.hasNext() && i < 5 ) {
            devolucion.add(it.next());
            i++;
            
        }
        return devolucion;
    }

    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();

        String[] nomes = { "Uxía", "Lúa", "Iria", "Noa" };
        String[] alcumes = { "A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema" };

        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitizos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para
            // asignar á meiga
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada
            // un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);

            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }

}

// public Meiga(String nome, String alcumeMáxicos) {
// Nome = nome;
// AlcumeMáxicos = alcumeMáxicos;
// FeitizosFav = new Feitizo[0];
// }
//
// public Meiga(String nome, String alcumeMáxicos, Feitizo[] feitizosFav) {
// Nome = nome;
// AlcumeMáxicos = alcumeMáxicos;
// FeitizosFav = feitizosFav;
// }
//
// public boolean EngadirFeitizo(Feitizo f){
// for (int i = 0; i < FeitizosFav.length; i++) {
// if (FeitizosFav[i].equals(f)){
// return false;
// }
// }
// FeitizosFav = Arrays.copyOf(FeitizosFav , FeitizosFav.length);
// FeitizosFav[FeitizosFav.length-1] = f;
// return true;
// }
// }

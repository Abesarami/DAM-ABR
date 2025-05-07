package UD6.abrexamen.festivalmeigas;
//autor Antonio Besada Ramilo

import org.jetbrains.annotations.NotNull;

import java.util.*;

//a ultimos 2 por hacer
public class Meiga implements Comparable<Meiga> {
    // Atributos
    private String nome;
    private String alcume;
    private List<Feitizo> feitizos;
    private Map<String, Integer> inventario;

    public List<Feitizo> getFeitizos() {
        return feitizos;
    }

    // Constructores
    public Meiga(String nome, String alcume, Collection<Feitizo> feitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcume = alcume;
        this.feitizos = new ArrayList<Feitizo>(feitizos);
        this.inventario = inventario;
    }

    public String getAlcume() {
        return alcume;
    }

    // EXEMPLO DE USO
    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        String[] nomes = {"Uxía", "Lúa", "Iria", "Noa"};
        String[] alcumes = {"A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema"};

        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
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

    static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizos) {
        // Gentea un sublista aleatoria de Feitizo
        List<Feitizo> feitizosRnd = new ArrayList<>(feitizos);
        Collections.shuffle(feitizosRnd);
        // Selecciona un número aleatorio de feitizos entre 1 e o tamaño da lista
        int numFeitizos = new Random().nextInt(feitizosRnd.size()) + 1;
        // Crea unha sublista con ese número de feitizos aleatorios
        List<Feitizo> subFeitizos = feitizosRnd.subList(0, numFeitizos);
        // Retorna a sublista como un Collection<Feitizo>
        return new ArrayList<>(subFeitizos);
    }

    static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientes, int i) {
        // Gentea un mapa aleatorio de ingredientes e cantidades
        Map<String, Integer> inventario = new java.util.HashMap<>();
        List<String> ingredientesRnd = new ArrayList<>(ingredientes);
        Collections.shuffle(ingredientesRnd);
        // Selecciona un número aleatorio de ingredientes entre 1 e o tamaño da lista
        int numIngredientes = new Random().nextInt(ingredientesRnd.size()) + 1;
        // Crea un mapa con ese número de ingredientes aleatorios e cantidades entre 1 e
        // 5
        for (int j = 0; j < numIngredientes; j++) {
            String ingrediente = ingredientesRnd.get(j);
            int cantidade = new Random().nextInt(5) + 1;
            inventario.put(ingrediente, cantidade);
        }
        return inventario;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        System.out.println("\nMEIGAS DE EXEMPLO:");
        System.out.println("====================\n");
        // Crear un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());
        Arrays.sort(meigasExemplo);
        // Mostrar as meigas de exemplo
        for (Meiga meiga : meigasExemplo) {
            System.out.println(meiga);
            System.out.println();
        }

        // Lanzar feitizos de exemplo
        System.out.println(meigasExemplo[0].alcume + " lanzando feitizos de exemplo:");
        meigasExemplo[0].lanzarFeitizos();
    }

    public int lanzarFeitizos() {
        int puntos = 0;
        Feitizo[] listaFeitizos = new Feitizo[0];
        for (int i = 0; i < getFeitizos().size(); i++) {
            listaFeitizos = Arrays.copyOf(listaFeitizos, listaFeitizos.length + 1);
            listaFeitizos[i] = (Feitizo) getFeitizos().toArray()[i];
        }
        Arrays.sort(listaFeitizos);
        boolean tiene = true;

        for (int i = 0; i < listaFeitizos.length; i++) {
            for (int j = 0; j < listaFeitizos[i].getIngredientes().length; j++) {
                if (inventario.containsKey(listaFeitizos[i].getIngredientes()[j])) {

                } else {
                    tiene = false;
                }
            }
            if (tiene) {
                puntos = puntos + listaFeitizos[i].getDificultade();
                System.out.println("-> Lanzando o feitizo: " + listaFeitizos[i].getNome());
                for (int j = 0; j < listaFeitizos[i].getIngredientes().length; j++) {
                    if (inventario.get(listaFeitizos[i].getIngredientes()[j]) <= 1) {
                        inventario.remove(listaFeitizos[i].getIngredientes()[j]);
                    } else {
                        inventario.replace(listaFeitizos[i].getIngredientes()[j], inventario.get(listaFeitizos[i].getIngredientes()[j]), inventario.get(listaFeitizos[i].getIngredientes()[j]) - 1);
                    }
                }
            } else {
                System.out.println("-x Non ten os ingredientes necesarios para lanzar o feitizo: " + listaFeitizos[i].getNome());
                tiene = true;
            }
        }
        return puntos;
    }

    @Override
    public String toString() {
        return nome + " (" + alcume + ") " + "\n" + feitizos.toString() + "\n" + inventario.toString();
    }


    @Override
    public int compareTo(@NotNull Meiga o) {
        return this.getFeitizos().size() - o.getFeitizos().size();
    }
}

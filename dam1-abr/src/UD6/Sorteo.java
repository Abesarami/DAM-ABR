package UD6;
import java.util.Set;
import ud5.rol.Personaje;

public class Sorteo<T> {
    TreeSet<T> lista=new TreeSet<>();
    boolean add(T e){

        return lista.add(e);
    }
    public T sortear(){
        Random rnd = new Random();
        T[] listaArray= (T[]) lista.toArray();
        return listaArray[rnd.nextInt(listaArray.length - 1 + 1) ];
    }
    Set<T> premiados (int numPremiados){
        TreeSet<T> listaGanadores=new TreeSet<>();
        for (int i = 0; i < numPremiados; i++) {
            listaGanadores.add(sortear());

        }
        return listaGanadores;
    }

    public static void main(String[] args) {
// Crea un sorteo entre 4 personajes para seleccionar los 2 que se enfrentarán en combate singular
        Sorteo<Personaje> sorteo = new Sorteo<>();
        sorteo.add(new Personaje("Aragorn"));
        sorteo.add(new Personaje("Mara"));
        sorteo.add(new Personaje("Dodol Bazbal"));
        sorteo.add(new Personaje("Lady Jet"));
        Set<Personaje> elegidos = sorteo.premiados(2);
        System.out.println(elegidos);
    }
}
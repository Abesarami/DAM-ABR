package ud5.praiasdegalicia;

import java.util.Arrays;
import java.util.Comparator;

public class Praia implements Comparable<Praia> {
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + concello + " - " + provincia + " - (" + lat + ", " + lon + ")";
    }

    @Override
    public int compareTo(Praia outra) {
        return Integer.compare(this.id, outra.id);
    }

    /**
     * Muestra los detalles de la playa en formato estructurado.
     */
    public void mostrarDetalles() {
        System.out.printf("%d - %s - %s - %s - (%.6f, %.6f)%n", id, nome, concello, provincia, lat, lon);
    }

    /**
     * Imprime una lista de playas hasta un límite especificado.
     * 
     * @param praias Array de playas a imprimir.
     * @param limite Número máximo de playas a mostrar.
     */
    public static void imprimirLista(Praia[] praias, int limite) {
        int max = Math.min(limite, praias.length);
        for (int i = 0; i < max; i++) {
            System.out.println(praias[i]);
        }
    }

    /**
     * Ordena una copia del array de playas por latitud, de norte a sur.
     * 
     * @param praias Array de playas a ordenar.
     * @return Nuevo array ordenado de mayor a menor latitud.
     */
    public static Praia[] ordenarPorLatitudNorteSur(Praia[] praias) {
        Praia[] copia = Arrays.copyOf(praias, praias.length);
        Arrays.sort(copia, Comparator.comparingDouble(Praia::getLat).reversed());
        return copia;
    }

    /**
     * Ordena una copia del array de playas por provincia, luego por concello y finalmente por nombre.
     * 
     * @param praias Array de playas a ordenar.
     * @return Nuevo array ordenado jerárquicamente.
     */
    public static Praia[] ordenarPorProvinciaConcelloNombre(Praia[] praias) {
        Praia[] copia = Arrays.copyOf(praias, praias.length);
        Arrays.sort(copia, Comparator.comparing(Praia::getProvincia)
                                     .thenComparing(Praia::getConcello)
                                     .thenComparing(Praia::getNome));
        return copia;
    }
}
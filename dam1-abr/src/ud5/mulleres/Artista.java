package ud5.mulleres;

public class Artista extends MullerTraballadora{
    String estilo;

    public Artista(String nome, int anoNacemento, String apelidos, String estilo) {
        super(nome, anoNacemento, apelidos);
        this.estilo = estilo;
    }

    @Override
    public String descripcionContribucion() {
        return "";
    }

    public String getEstilo() {
        return estilo;
    }

    public String toString() {
        return nome + " " + apelidos + " Destacou na arte co estilo: " + estilo;
    }
}

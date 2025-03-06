package ud5.mulleres;

public class Politica extends MullerTraballadora implements IActivistas{
String causa;

    public Politica(String nome, int anoNacemento, String apelidos, String causa) {
        super(nome, anoNacemento, apelidos);
        this.causa = causa;
    }

    @Override
    public String getCausaDefendida() {
        return causa;
    }

    @Override
    public String descripcionContribucion() {
        return "";
    }

    @Override
    public String toString() {
        return nome + " " + apelidos + " foi unha politica e activista destacada por: " + causa;
    }
}

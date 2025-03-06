package ud5.mulleres;

public class Cientifica extends MullerTraballadora implements IPionera{
    public Cientifica(String nome, int anoNacemento, String apelidos, String descubrimiento) {
        super(nome, anoNacemento, apelidos);
        this.descubrimiento = descubrimiento;
    }

    String descubrimiento;

    @Override
    public String getDescubrimientoOuAporte() {
        return descubrimiento;
    }

    @Override
    public String descripcionContribucion() {
        return "";
    }
    public String toString() {
        return nome + " " + apelidos + " foi unha cientifica pionera que descubriu: " + descubrimiento;
    }
}

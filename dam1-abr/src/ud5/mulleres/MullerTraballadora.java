package ud5.mulleres;

public abstract class MullerTraballadora {
    String nome;
    String apelidos;
    int anoNacemento;

    public int Edad(int anoActual){
        int edad = anoActual-anoNacemento;
        return edad;
    }
    public abstract String descripcionContribucion();

    public MullerTraballadora(String nome, int anoNacemento, String apelidos) {
        this.nome = nome;
        this.anoNacemento = anoNacemento;
        this.apelidos = apelidos;
    }

}

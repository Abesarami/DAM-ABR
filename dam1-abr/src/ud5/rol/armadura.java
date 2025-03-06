package ud5.rol;

public class armadura extends item{

    String tipo;
    public armadura(String nombreItem, double peso, int valor,String Tipo) {
        super(nombreItem, peso, valor);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

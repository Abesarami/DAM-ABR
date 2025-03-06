package ud5.rol;

abstract class item {
    String NombreItem;
    double peso;
    int valor;

    public item(String nombreItem, double peso, int valor) {
        NombreItem = nombreItem;
        this.peso = peso;
        this.valor = valor;
    }


    public String getNombreItem() {
        return NombreItem;
    }

    public void setNombreItem(String nombreItem) {
        NombreItem = nombreItem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

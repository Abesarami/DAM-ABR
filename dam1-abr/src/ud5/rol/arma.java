package ud5.rol;

public class arma extends item {
    int ataque;
    boolean dosmanos;

    public arma (String nombreItem, double peso, int valor, int ataque, boolean dosmanos) {
        super(nombreItem, peso, valor);
        this.ataque = ataque;
        this.dosmanos = dosmanos;
    }


    public boolean isDosmanos() {
        return dosmanos;
    }

    public void setDosmanos(boolean dosmanos) {
        this.dosmanos = dosmanos;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}

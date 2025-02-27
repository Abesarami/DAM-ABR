package ud5.rol;

import java.util.Random;

public class Monstruo {
    private String nombre;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int puntosVida;

    public Monstruo(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.puntosVida = puntosVida;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public boolean perderVida(int puntosDanio) {
        puntosVida -= puntosDanio;
        return puntosVida <= 0;
    }

    public int atacar(Personaje enemigo) {
        Random rand = new Random();
        int ataqueTotal = ataque + rand.nextInt(100) + 1;
        int defensaTotal = enemigo.getAgilidad() + rand.nextInt(100) + 1;
        int danio = Math.max(0, Math.min(ataqueTotal - defensaTotal, enemigo.getPuntos()));
        enemigo.perderVida(danio);
        return danio;
    }

    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return (nombre != null ? nombre + "-" : "") + getClass().getSimpleName() + " (" + puntosVida + ")";
    }

    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public int getVelocidad() { return velocidad; }
    public int getPuntosVida() { return puntosVida; }


    
    class Orco extends Monstruo {
        public Orco() {
            super("Orco", getRandomValue(30, 80), getRandomValue(30, 50), getRandomValue(30, 60), getRandomValue(30, 100));
        }

        public Orco(String nombre) {
            super(nombre, getRandomValue(30, 80), getRandomValue(30, 50), getRandomValue(30, 60), getRandomValue(30, 100));
        }
    }

    class Troll extends Monstruo {
        public Troll() {
            super("Troll", getRandomValue(60, 120), getRandomValue(50, 70), getRandomValue(20, 40), getRandomValue(100, 200));
        }

        public Troll(String nombre) {
            super(nombre, getRandomValue(60, 120), getRandomValue(50, 70), getRandomValue(20, 40), getRandomValue(100, 200));
        }
    }

    class Aranha extends Monstruo {
        public Aranha() {
            super("Aranha", getRandomValue(10, 50), getRandomValue(20, 40), getRandomValue(40, 70), getRandomValue(30, 80));
        }

        public Aranha(String nombre) {
            super(nombre, getRandomValue(10, 50), getRandomValue(20, 40), getRandomValue(40, 70), getRandomValue(30, 80));
        }
    }

    class Dragon extends Monstruo {
        public Dragon() {
            super("Dragon", getRandomValue(100, 200), getRandomValue(60, 100), getRandomValue(80, 120), getRandomValue(120, 250));
        }

        public Dragon(String nombre) {
            super(nombre, getRandomValue(100, 200), getRandomValue(60, 100), getRandomValue(80, 120), getRandomValue(120, 250));
        }
    }
    
    private static int getRandomValue(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    public Monstruo generaMonstruoAleatorio() {
        Random rand = new Random();
        int probabilidad = rand.nextInt(100);
        if (probabilidad < 40) {
            return new Orco();
        } else if (probabilidad < 70) {
            return new Aranha();
        } else if (probabilidad < 90) {
            return new Troll();
        } else {
            return new Dragon();
        }
    }
    
}

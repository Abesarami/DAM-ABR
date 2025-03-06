package ud5.rol;

import java.util.Random;

public class Personaje {

    public enum RAZAS {
        HUMANO, ELFO, ENANO, HOBBIT,
        ORCO, TROLL
    }

    private int fuerza;
    private int agilidad;
    private int constitucion;
    private RAZAS raza;
    private String nombre;
    private int nivel;
    private int experiencia;
    private int puntosTot;
    public int puntos;


    public Personaje(int fuerza, int agilidad, int constitucion, RAZAS raza, String nombre, int nivel,
                     int experiencia, int puntosTot) {
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.raza = raza;
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosTot = puntosTot;
        this.puntos = puntosTot;
    }

    public Personaje(int fuerza, int agilidad, int constitucion, RAZAS raza, String nombre) {
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.raza = raza;
        this.nombre = nombre;
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosTot = constitucion + 50;
        this.puntos = puntosTot;
    }


    public Personaje(String nombre) {
        this.nombre = nombre;
        this.raza = RAZAS.HUMANO;
        this.nivel = 1;
        this.experiencia = 0;
        this.fuerza = getRandomValue(0, 100);
        this.agilidad = getRandomValue(0, 100);
        this.constitucion = getRandomValue(0, 100);
        this.puntosTot = constitucion + 50;
        this.puntos = puntosTot;

    }
    private static int getRandomValue(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    public Personaje(String nombre, RAZAS raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = 1;
        this.experiencia = 0;
        this.fuerza = getRandomValue(0, 100);
        this.agilidad = getRandomValue(0, 100);
        this.constitucion = getRandomValue(0, 100);
        this.puntosTot = constitucion + 50;
        this.puntos = puntosTot;

    }

    public void mostrar() {
        System.out.println(nombre);
        System.out.println(puntosTot + "hp");
        System.out.println(raza);
        System.out.println(nivel);
        System.out.println(experiencia);
        System.out.println(fuerza + "fuerza");
        System.out.println(agilidad + "agilidad");
        System.out.println(constitucion + "constitucion");


    }



    public void sumarXP(int puntosXP) {

        if ((experiencia + puntosXP) >= 1000)
            for (int i = (experiencia + puntosXP) / 1000; i < 1; i--) {
                subirNivel();
            }
        else experiencia = experiencia + puntosXP;
    }

    
    public String toString() {
        return nombre + " (" + puntos + "/" + puntosTot + " hp)";
    }

    public int getPuntos() { return puntos; }
    public int getPuntosTot() { return puntosTot; }
    public int getExperiencia() { return experiencia; }
    public String getNombre() { return nombre; }
    public RAZAS getRaza() { return raza; }
    public int getConstitucion() { return constitucion; }
    public int getAgilidad() { return agilidad; }
    public int getFuerza() { return fuerza; }
    public int getNivel() { return nivel; }

    public byte sumarExperiencia(int puntosXP) {
        experiencia += puntosXP;
        byte nivelesSubidos = 0;
        while (experiencia >= 1000) {
            experiencia -= 1000;
            subirNivel();
            nivelesSubidos++;
        }
        return nivelesSubidos;
    }

    private void subirNivel() {
        nivel++;
        fuerza *= 1.05;
        agilidad *= 1.05;
        constitucion *= 1.05;
        puntosTot = constitucion + 50;
        if (puntos > puntosTot) {
            puntos = puntosTot;
        }
    }

    public void curar() {
        puntos = Math.min(puntos, puntosTot);
    }

    public boolean perderVida(int puntosDanio) {
        puntos -= puntosDanio;
        return puntos <= 0;
    }

    public boolean estaVivo() {
        return puntos > 0;
    }

    public int atacar(Personaje enemigo) {
        Random rand = new Random();
        int ataque = fuerza + rand.nextInt(100) + 1;
        int defensa = enemigo.agilidad + rand.nextInt(100) + 1;
        int danio = Math.max(0, Math.min(ataque - defensa, enemigo.puntos));
        enemigo.perderVida(danio);
        this.sumarExperiencia(danio);
        enemigo.sumarExperiencia(danio);
        return danio;
    }
}



package ud5.rol;

public class Personaje {

    private enum RAZAS {
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
        this.fuerza = (int) Math.random() * 100 + 1;
        this.agilidad = (int) Math.random() * 100 + 1;
        this.constitucion = (int) Math.random() * 100 + 1;
        this.puntosTot = constitucion + 50;
        this.puntos = puntosTot;

    }

    public Personaje(String nombre, RAZAS raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = 1;
        this.experiencia = 0;
        this.fuerza = (int) Math.random() * 100 + 1;
        this.agilidad = (int) Math.random() * 100 + 1;
        this.constitucion = (int) Math.random() * 100 + 1;
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

    @Override
    public String toString() {
        System.out.println(nombre);
        System.out.println(puntos + "/" + puntosTot);
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPuntosTot() {
        return puntosTot;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public RAZAS getRaza() {
        return raza;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getNivel() {
        return nivel;
    }

    public void sumarXP(int puntosXP) {

        if ((experiencia + puntosXP) >= 1000)
            for (int i = (experiencia + puntosXP) / 1000; i < 1; i--) {
                subirNivel();
            }
        else experiencia = experiencia + puntosXP;
    }

    private void subirNivel() {
        nivel++;
    }
}

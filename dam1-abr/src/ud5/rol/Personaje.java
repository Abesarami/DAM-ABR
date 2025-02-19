package ud5.rol;

public class Personaje {

private enum RAZAS{
    HUMANO, ELFO, ENANO, HOBBIT,
ORCO,TROLL
}
private int fuerza;
private int agilidad;
private int constitucion;
private RAZAS raza;
private String nombre;
private int nivel;
private int experiencia;
private int puntos;

public Personaje(int fuerza, int agilidad, int constitucion, RAZAS raza, String nombre, int nivel,
        int experiencia, int puntos) {
    this.fuerza = fuerza;
    this.agilidad = agilidad;
    this.constitucion = constitucion;
    this.raza = raza;
    this.nombre = nombre;
    this.nivel = nivel;
    this.experiencia = experiencia;
    this.puntos = puntos;
}

public Personaje(int fuerza, int agilidad, int constitucion, RAZAS raza, String nombre) {
    this.fuerza = fuerza;
    this.agilidad = agilidad;
    this.constitucion = constitucion;
    this.raza = raza;
    this.nombre = nombre;
}

public Personaje(String nombre) {
    this.nombre = nombre;
    this.raza = RAZAS.HUMANO;
    
}
    

    
}

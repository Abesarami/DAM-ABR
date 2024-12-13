package ud3.propuestos;



public class Jugador{


enum POSICION {
PORTERO,
DEFENSA,
CENTROCAMPISTAS,
DELANTERO
}


String name,dni;
double estatura;
POSICION posicion;

public Jugador(String name){
this.name = name;
}

public Jugador(String name, POSICION posicion){
this(name);
this.posicion = posicion;
}

}


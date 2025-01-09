package ud3.exercicios.abr20241218;



public class jugador{


enum POSICION {
PORTERO,
DEFENSA,
CENTROCAMPISTAS,
DELANTERO
}


String name,dni;
double estatura;
POSICION posicion;

public jugador(String name){
this.name = name;
}

public jugador(String name, POSICION posicion){
this(name);
this.posicion = posicion;
}

}


package UD6;

import java.util.Set;
import java.util.TreeSet;

//E1212. Implementar un métod estático que lleve a cabo la unión de dos conjuntos de
//elementos genéricos. La unión es un nuevo conjunto con todos los elementos que
//pertenezcan, al menos a uno de los dos conjuntos.
//Implementa en otro métod genérico la intersección, formada por los elementos comunes
//a los dos conjuntos. Los prototipos de los métodos son:
//● static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2)
//● static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2)
public class E1212 {

    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
Set<E> union = new TreeSet<>();

    union.addAll(conjunto1);
        union.addAll(conjunto2);
return union;
    }
    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> interseccion = new TreeSet<>();

        interseccion.addAll(conjunto1);
        interseccion.retainAll(conjunto2);
        return interseccion;
    }
    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> interseccion = new TreeSet<>();

        interseccion.addAll(conjunto1);
        interseccion.removeAll(conjunto2);
        return interseccion;
    }


}

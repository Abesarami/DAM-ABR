package UD6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class chuleta {
    public static <T> void main(String[] args) {
        // comparator y comparable

        /*
         * implementar la interfaz comparable y hacer el metodo compareTo de esta forma
         * public int compareTo(Jugador jugador) {
         * return this.getNombre().compareTo(jugador.getNombre()) ;
         * }
         * donde esta bastante bien explicao matate 
         * 
         * si son numeros lo que quieres comparar se restan
         * public int compareTo(Jugador jugador) {
         * return (int) (this.getEstatura() - jugador.getEstatura()) ;
         * }
         * asi chavalote despues del comparable hay que poner el <nombredelObjeto>
         */

        // listas

        /// creacion
        /// array variable
        /*
         * boolean add(E e) añadir cosas a la lista
         * boolean remove(Object o) quitar cosas de la lista
         * void clear() limpiar la lista
         * int size() .lenght xddd weon
         * boolean isEmpty() mira si esta vacio
         * boolean contains(Object o) mira si lo tiene dentro
         * String toString() llama al tostring de cada uno de los objetos
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * CHULETA DE LA INTERFAZ ITERATOR (java.util.Iterator)
         * 
         * ¿QUÉ ES?
         * -> Iterator es una interfaz que permite recorrer colecciones (List, Set,
         * etc.) de forma secuencial y segura.
         * 
         * MÉTODOS PRINCIPALES:
         * 
         * boolean hasNext()
         * -> Devuelve true si hay más elementos por iterar.
         * 
         * T next()
         * -> Devuelve el siguiente elemento de la colección y avanza el iterador.
         * 
         * void remove()
         * -> Elimina el último elemento devuelto por next().
         * (¡Debe llamarse después de next(), si no lanza excepción!)
         * 
         * ¿CÓMO SE USA?
         * Iterator<T> it = coleccion.iterator();
         * while (it.hasNext()) {
         * T elemento = it.next();
         * // Usar elemento
         * }
         * 
         * NOTAS:
         * No se puede modificar la colección directamente mientras se itera con
         * Iterator.
         * Se recomienda usar remove() del Iterator en vez de coleccion.remove().
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */

        List<T> Lista = new ArrayList<>();

        // set lista sin repeticiones

        Set<T> set = new HashSet<>();
        Set<T> set2 = new TreeSet<>();

        // Mapas
        // Lista de cosas con key

        Map<Integer, T> mapa = new HashMap<>();
        Map<Integer, T> mapa2 = new TreeMap();

        /*
         * MÉTODOS PRINCIPALES:
         * 
         * V put(K key, V value)
         * → Inserta o reemplaza el valor asociado a la clave.
         * → Devuelve el valor anterior o null si no existía.
         * 
         * V remove(Object key)
         * → Elimina la entrada con la clave dada.
         * → Devuelve el valor eliminado o null si no estaba.
         * 
         * void clear()
         * → Elimina todas las entradas del mapa.
         * 
         * V get(Object key)
         * → Devuelve el valor asociado a la clave.
         * → Si la clave no existe, devuelve null.
         * 
         * boolean containsKey(Object key)
         * → Devuelve true si la clave está en el mapa.
         * 
         * boolean containsValue(Object value)
         * → Devuelve true si el valor existe en el mapa.
         * 
         * VISTAS DEL MAPA:
         * 
         * Set<K> keySet()
         * → Conjunto con todas las claves del mapa.
         * 
         * Collection<V> values()
         * → Colección con todos los valores del mapa.
         * 
         * Set<Map.Entry<K,V>> entrySet()
         * → Conjunto de objetos Map.Entry<K,V>, cada uno contiene una clave y su valor
         * asociado.
         * 
         */





        /*
         * clase collections explicada
         * 
         * 
         * | Método | Descrición |
         * |--------|------------|
         * | Collections.sort(List<T> lista) | Ordena a lista segundo a orde natural dos
         * elementos (debe implementar Comparable). |
         * 
         * | Collections.sort(List<T> lista, Comparator<T> c) | Ordena a lista segundo
         * un comparador personalizado. |
         * 
         * | Collections.shuffle(List<?> lista) | Desordena os elementos da lista de
         * forma aleatoria. |
         * 
         * | Collections.reverse(List<?> lista) | Invierte a orde dos elementos da
         * lista. |
         * 
         * | Collections.max(Collection<T> col) | Devolve o elemento máximo segundo a
         * orde natural. |
         * 
         * | Collections.min(Collection<T> col) | Devolve o elemento mínimo. |
         * 
         * | Collections.frequency(Collection<?> col, Object o) | Conta cantas veces
         * aparece un obxecto na colección. |
         * 
         * | Collections.emptyList() | Crea unha lista baleira e inmutable. |
         * 
         * | Collections.fill(List<? super T> lista, T valor) | Enche toda a lista co
         * mesmo valor. |
         * 
         * | Collections.copy(List<? super T> dest, List<? extends T> src) | Copia os
         * elementos da lista src na lista dest. |
         * 
         * | Collections.replaceAll(List<T> lista, T antigo, T novo) | Substitúe todas
         * as aparicións dun valor por outro. |
         * 
         * 
         */

    }

}

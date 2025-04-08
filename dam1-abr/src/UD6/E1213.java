package UD6;


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//E1213. Implementar la clase Sorteo con parámetros genéricos. Deberá guardar un
//conjunto de valores distintos de tipo genérico, suministrados por consola y será capaz de
//generar una combinación premiada de un tamaño determinado. Deberán implementarse.
//como minimo, los métodos:
//● boolean add (T elemento) que añadirá un elemento nuevo al conjunto de
//valores posibles en una apuesta. Si el elemento se añade, devuelve true y, en
//caso contrario, debido a que ya estaba presente, false.
//● Set<T> premiados (int numPremiados) que devolverá una combinación
//ganadora de numPremiados elementos distintos.
public class E1213 {
    public static void main(String[] args) {

    }
    public class Sorteo<T>{
        TreeSet<T> lista=new TreeSet<>();
        boolean add(T e){

            return lista.add(e);
        }
        public T sortear(){
            Random rnd = new Random();
         T[] listaArray= (T[]) lista.toArray();
         return listaArray[rnd.nextInt(listaArray.length - 1 + 1) ];
        }
        Set<T> premiados (int numPremiados){
            TreeSet<T> listaGanadores=new TreeSet<>();
            for (int i = 0; i < numPremiados; i++) {
               listaGanadores.add(sortear());

            }
            return listaGanadores;
        }
    }
}

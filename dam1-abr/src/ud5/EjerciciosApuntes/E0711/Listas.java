package ud5.EjerciciosApuntes.E0711;
/*
Implementar la clase Lista correspondiente a una lista de números de la clase Integer.
Los números se guardarán en una tabla que se redimensionará con las inserciones y
eliminaciones, aumentando o disminuyendo la capacidad de la lista según el caso.
Entre los métodos de la clase, se incluirán las siguientes tareas:
1. Un constructor que inicialice la tabla con un tamaño 0.
2. Obtener el número de elementos insertados en la lista.
3. Insertar un número al final de la lista.
4. Insertar un número al principio de la lista.
5. Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa
como parámetro.
6. Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
7. Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
8. Obtener el elemento cuyo índice se pasa como parámetro.
9. Buscar un número en la lista, devolviendo el índice del primer lugar donde se
encuentre. Si no está, devolverá -1.
10. Mostrar los elementos de la lista por consola.


 */
public class Listas {
 Integer[] lista ;
 int size;

    public Listas(Integer[] lista){
        lista = new Integer[0];
    }
    public Integer getListalength(){
        return lista.length;
    }


}

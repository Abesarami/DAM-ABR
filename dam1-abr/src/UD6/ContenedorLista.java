package UD6;

import java.util.Arrays;

//E1202. Implementar, con tipos genéricos, la clase ContenedorLista, donde podremos guardar
//tantos objetos como deseemos. Para ello utilizaremos una tabla, que inicialmente tendrá tamaño
//cero y se irá redimensionando según añadamos o eliminemos elementos. La clase, además del
//constructor y toString(), tendrá los siguientes métodos:
//● void insertarAlPrincipio(T nuevo)
//● void insertarAlFinal(T nuevo)
//● T extraerDelPrincipio()
//● T extraerDelFinal()
//● void ordenar()
public class ContenedorLista<T> {
T[] list;
    public ContenedorLista(T[] t) {
    list=t;
    }

    void insetarAlPrincipio(T nuevo) {
        System.arraycopy(list,0,list,1,list.length+1);
        list[0]=nuevo;
    }

    void insertarAlFinal(T nuevo) {
    list = Arrays.copyOf(list,list.length+1);
    list[list.length]=nuevo;
    }
    public T extraeDelFinal(){
        T t;
        t= list[list.length];
        return t;
    }
    public T extraeDelIncio(){
        T t;
        t= list[0];
        return t;
    }
    void ordenar(){
    Arrays.sort(list);
    }

}

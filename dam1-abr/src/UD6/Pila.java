//package UD6;
//
//import java.util.Arrays;
//
//public interface Pila  {
//    T[] list;
//    public ContenedorLista(T[] t) {
//        list=t;
//    }
//
//    void insetarAlPrincipio(T nuevo) {
//        System.arraycopy(list,0,list,1,list.length+1);
//        list[0]=nuevo;
//    }
//
//    void insertarAlFinal(T nuevo) {
//        list = Arrays.copyOf(list,list.length+1);
//        list[list.length]=nuevo;
//    }
//    public T extraeDelFinal(){
//        T t;
//        t= list[list.length];
//        return t;
//    }
//    static T extraeDelIncio(){
//
//        return null;
//    }
//    void ordenar(){
//        Arrays.sort(list);
//    }
//
//}

//}

package ud6;

import java.util.Arrays;
import java.util.Objects;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null)
                cont++;
        return cont;
    }
    public static <U> U[] add(U e, U[] t){
        U[] newArray = Arrays.copyOf(t, t.length + 1);
        newArray[t.length] = e;
        return newArray;
    }
    public static <U> boolean buscar(U e, U[] t){
        U[] newArray = Arrays.copyOf(t,t.length);
        Arrays.sort(t);
        if (Arrays.binarySearch(t,e)>0){
        return true;
        }
        return false;

    }
    public static <U,V> Objects[] concatenar(U[] t1, V[] t2){
        Objects[] newArray = Arrays.copyOf(t1,t1.length);
    
        for (int i = 0; i < t2.length; i++) {
            newArray = Arrays.copyOf(newArray,newArray.length+1);
            newArray[newArray.length-1] = t2[i];
        }
        return newArray;
    }

}

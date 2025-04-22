package UD6.e1301;

import UD6.E1303.interfaz;

import java.util.Arrays;
import java.util.Comparator;

public class MAX {
    static <T> T max(T[] t, Comparator<T> c){
        T maximo;
        Arrays.stream(t).sorted(c);
        maximo = t[0];

        return maximo;
    }
}


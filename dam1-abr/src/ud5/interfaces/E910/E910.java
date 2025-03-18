package ud5.interfaces.E910;
//E0910. Implementar una clase comparadora que permita ordenar números enteros en
//sentido decreciente. Crear una tabla de 20 números aleatorios comprendidos entre 1 y
//100 y ordenarla en sentido decreciente.
import ud4.ArraysUtil;

import java.util.Arrays;
import java.util.Comparator;

public class E910 {
    public static void main(String[] args) {
        Integer t[] =ud4.ArraysUtil.arrayAleatorioInteger(20,1,100);
        Arrays.sort(t,Comparator.reverseOrder());
        System.out.println(Arrays.toString(t));

    }
}

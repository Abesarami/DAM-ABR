package ud4.apuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0506 {
    static int numAciertos(int[] apuesta, int[] ganadora) {
        int numAciertos = 0;

        for (int numApuesta : apuesta) {
            if (Arrays.binarySearch(ganadora, numApuesta) >= 0) {
                numAciertos++;
                System.out.println("Un acierto mas");
            }

        }

        return numAciertos;

    }

    public static void main(String[] args) {
        int[] apuesta = ArraysUtil.arrayAleatorio(6, 1, 46);
        int[] ganadora = ArraysUtil.arrayAleatorio(6, 1, 46);
        Arrays.sort(ganadora);
        System.out.println(Arrays.toString(apuesta));
        System.out.println(Arrays.toString(ganadora));
        System.out.println(numAciertos(apuesta, ganadora));

    }
}

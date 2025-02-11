package ud4.ejercicios05022025;

public class MontanaRusa {
    public static void main(String[] args) {
        int[] alturas = {  3, 2, 1, 2, 1, 2, 1, 2, 3};

        System.out.println(contarPicos(alturas));
    }

   public static int contarPicos(int[] alturas){
        int numeroPicos = 0;
        int anterior = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i]>anterior){
                if (i+1< alturas.length){
                    if (alturas[i]>alturas[i+1]){
                        numeroPicos=numeroPicos+1;
                    }

                }else{
                    if (alturas[i]>alturas[0]){
                        numeroPicos=numeroPicos+1;
                    }
                }


            }
            anterior = alturas[i];

        }


        return numeroPicos;
    }


}

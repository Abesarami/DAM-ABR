package ud4.ejercicios05022025;
import ud4.ArraysUtil;

import java.util.Arrays;
import java.util.*;
public class ConjugarVerbos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un verbo regular en infinitivo");
        String verbo = sc.nextLine();
        while (verbo != "fin"){
            System.out.println(Arrays.toString(conjugarPresente(verbo)));
            System.out.println("Si quieres parar el programa escribe fin");
            verbo = sc.nextLine();
        }


        }

    public static String[] conjugarTiempoVerbal(String verbo, String tiempoVerbal){
        String[] verboConjugado = new String[6];
        char[] arrayVerbo = verbo.toCharArray();

switch (tiempoVerbal){
    case "Presente simple":
       verboConjugado = conjugarPresente(verbo);
        break;

    case "Pretérito perfecto simple":
        if (arrayVerbo[arrayVerbo.length-2]=='a'){
            String[] split = verbo.split("ar");

            verboConjugado[0] = split[0]+'é';
            verboConjugado[1] = split[0]+'a'+'s'+'t'+'e';
            verboConjugado[2] = split[0]+'ó';
            verboConjugado[3] = split[0]+'a'+'m'+'o'+'s';
            verboConjugado[4] = split[0]+'á'+'s'+'t'+'e'+'i'+'s';
            verboConjugado[5] = split[0]+'a'+'r'+'o'+'n';

        }else if (arrayVerbo[arrayVerbo.length-2]=='e'){
            String[] split = verbo.split("er");

            verboConjugado[0] = split[0]+'í';
            verboConjugado[1] = split[0]+'i'+'s'+'t'+'e';
            verboConjugado[2] = split[0]+'i'+'ó';
            verboConjugado[3] = split[0]+'i'+'m'+'o'+'s';
            verboConjugado[4] = split[0]+'í'+'s'+'t'+'e'+'i'+'s';
            verboConjugado[5] = split[0]+'i'+'e'+'r'+'o'+'n';

        }else if (arrayVerbo[arrayVerbo.length-2]=='i'){
            String[] split = verbo.split("ir");

            verboConjugado[0] = split[0]+'í';
            verboConjugado[1] = split[0]+'i'+'s'+'t'+'e';
            verboConjugado[2] = split[0]+'i'+'ó';
            verboConjugado[3] = split[0]+'i'+'m'+'o'+'s';
            verboConjugado[4] = split[0]+'í'+'s'+'t'+'e'+'i'+'s';
            verboConjugado[5] = split[0]+'i'+'e'+'r'+'o'+'n';

        }else{
            verboConjugado[0] = "error";
            verboConjugado[1] = "error";
            verboConjugado[2] = "error";
            verboConjugado[3] = "error";
            verboConjugado[4] = "error";
            verboConjugado[5] = "error";
        }
        break;
    case "Futuro simple":
        if (arrayVerbo[arrayVerbo.length-2]=='a'){
            String[] split = verbo.split("ar");

            verboConjugado[0] = verbo+'é';
            verboConjugado[1] = verbo+"rás";
            verboConjugado[2] = verbo+"rá";
            verboConjugado[3] = verbo+"remos";
            verboConjugado[4] = verbo+"réis";
            verboConjugado[5] = verbo+"rán";

        }else if (arrayVerbo[arrayVerbo.length-2]=='e'){
            String[] split = verbo.split("er");

            verboConjugado[0] = verbo+'é';
            verboConjugado[1] = verbo+"rás";
            verboConjugado[2] = verbo+"rá";
            verboConjugado[3] = verbo+"remos";
            verboConjugado[4] = verbo+"réis";
            verboConjugado[5] = verbo+"rán";

        }else if (arrayVerbo[arrayVerbo.length-2]=='i'){
            String[] split = verbo.split("ir");

            verboConjugado[0] = verbo+'é';
            verboConjugado[1] = verbo+"rás";
            verboConjugado[2] = verbo+"rá";
            verboConjugado[3] = verbo+"remos";
            verboConjugado[4] = verbo+"réis";
            verboConjugado[5] = verbo+"rán";

        }else{
            verboConjugado[0] = "error";
            verboConjugado[1] = "error";
            verboConjugado[2] = "error";
            verboConjugado[3] = "error";
            verboConjugado[4] = "error";
            verboConjugado[5] = "error";
        }
        break;
    default:
        throw new IllegalStateException("Unexpected value: " + tiempoVerbal);
}



        return verboConjugado;

    }
    public static String[] conjugarPresente(String verbo){
        String[] verboPresente = new String[6];
        char[] arrayVerbo = verbo.toCharArray();


        if (arrayVerbo[arrayVerbo.length-2]=='a'){
            String[] split = verbo.split("ar");

                verboPresente[0] = split[0]+'o';
            verboPresente[1] = split[0]+'a'+'s';
            verboPresente[2] = split[0]+'a';
            verboPresente[3] = split[0]+'a'+'m'+'o'+'s';
            verboPresente[4] = split[0]+'á'+'i'+'s';
            verboPresente[5] = split[0]+'a'+'n';

        }else if (arrayVerbo[arrayVerbo.length-2]=='e'){
            String[] split = verbo.split("er");

            verboPresente[0] = split[0]+'o';
            verboPresente[1] = split[0]+'e'+'s';
            verboPresente[2] = split[0]+'e';
            verboPresente[3] = split[0]+'e'+'m'+'o'+'s';
            verboPresente[4] = split[0]+'é'+'i'+'s';
            verboPresente[5] = split[0]+'e'+'n';

        }else if (arrayVerbo[arrayVerbo.length-2]=='i'){
            String[] split = verbo.split("ir");

            verboPresente[0] = split[0]+'o';
            verboPresente[1] = split[0]+'e'+'s';
            verboPresente[2] = split[0]+'e';
            verboPresente[3] = split[0]+'i'+'m'+'o'+'s';
            verboPresente[4] = split[0]+'í'+'s';
            verboPresente[5] = split[0]+'e'+'n';

        }else{
            verboPresente[0] = "error";
            verboPresente[1] = "error";
            verboPresente[2] = "error";
            verboPresente[3] = "error";
            verboPresente[4] = "error";
            verboPresente[5] = "error";
        }


        return verboPresente;
    }
}

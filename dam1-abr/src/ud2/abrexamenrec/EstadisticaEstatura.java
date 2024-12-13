package ud2.abrexamenrec;

/*
 * Antonio Besada Ramilo
 */
import java.util.*;

public class EstadisticaEstatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = 0.1;
        double alturaTotal = 0;
        double alturaMedia = 0;
        int numeroAlumnos = 0;
        double alturaBajo = 100;
        double alturaAlto = 0;
        boolean salir = true;
        while (salir == true) {
            System.out.println(
                    "Introduce la estatura de los alumnos 1 por 1 si quieres parar puedes escribir un numero negativo");
            altura = sc.nextDouble();
            if (altura > 0) {

                numeroAlumnos = numeroAlumnos + 1;
                alturaTotal = altura + alturaTotal;
                alturaMedia = alturaTotal / numeroAlumnos;

                if (alturaBajo > altura) {
                    alturaBajo = altura;
                }
                if (alturaAlto < altura) {
                    alturaAlto = altura;
                }
                sc.nextLine();
            } else {
                salir = false;
                System.out.println("cerrandoPrograma");
                break;
            }
        }
        System.out.println("La altura media es:" + alturaMedia + " La persona mas alta mide: " + alturaAlto
                + " la persona mas baja mide: " + alturaBajo);
        sc.close();
    }
}
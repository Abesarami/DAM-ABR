package ud2.abrexamen;

import java.util.*;

public class formas {

    public static void main(String[] args) {
        System.out.println("Elige que forma quieres que dibuje");
        System.out.println("1.triangulo");
        System.out.println("2.rectangulo");
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        int opcion = 0;
        int numerofallos = 0;

        do {
            repetir = false;
            try {
                System.out.print("Introduce numero opcion del menu: ");
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido intentalo de nuevo");
                if (numerofallos <= 3) {
                    
                    repetir = true;
                    numerofallos = numerofallos + 1;
                }
                sc.nextLine();
            }
        } while (repetir);

        switch (opcion) {
            case 1:

                System.out.print("Introduce número de lado: ");
                int lado = sc.nextInt();

                for (int i = lado; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                int filas, columnas;
                // leer número de filas hasta que sea un número > 1
                do {
                    System.out.print("Introduce número de filas: ");
                    filas = sc.nextInt();
                } while (filas < 2);
                // leer número de columnas hasta que sea un número > 1
                do {
                    System.out.print("Introduce número de columnas: ");
                    columnas = sc.nextInt();
                } while (columnas < 2);
                for (int i = 1; i <= filas; i++) { // for para las filas
                    for (int j = 1; j <= columnas; j++) { // for para las columnas
                        System.out.print(" * ");
                    } // fin del for para las columnas
                    System.out.println();
                } // fin del for para las filas
                sc.close();

                break;
            case 3:

                break;

            default:
                System.out.println("esa opcion no existe");

                break;
        }
    }
}

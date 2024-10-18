package ud1.ejercicios;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {

        double base;
        double Altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("cual es la base del triangulo");
        base = sc.nextDouble();
        System.out.println("Muy bien la base es:" + base + " y cual es la altura?");
        Altura = sc.nextDouble();
        sc.close();
        Double Area_triangulo = (base * Altura) / 2;

        System.out.println("El area del triangulo sera " + Area_triangulo);

        
    }
}


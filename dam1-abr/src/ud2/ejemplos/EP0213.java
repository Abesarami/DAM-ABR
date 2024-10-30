package ud2.ejemplos;

import java.util.*;

public class EP0213 {
    public static void main(String[] args) {
        System.out.println(
                "En este programa calcularemos si la comida es suficiente para los animales y si no lo es diremos cuanta comida falta");

        Scanner sc = new Scanner(System.in);

        double cantidacomida, cantidadAnimales, consumoAnimal, cantidadsobrante;

        System.out.println("Introduce la cantidad de animales");
        cantidadAnimales = sc.nextDouble();
        System.out.println("Introduce la cantidad de comida");
        cantidacomida = sc.nextDouble();
        System.out.println("Introduce lo que consumen de comida cada animal");
        consumoAnimal = sc.nextDouble();
        sc.close();
        cantidadsobrante = cantidacomida - cantidadAnimales * consumoAnimal;

        if (cantidacomida > (cantidadAnimales * consumoAnimal)) {
            System.out.println("Tienes comida suficiente y te sobraran: " + cantidadsobrante);

        }
        else{
            System.out.println("No tienes suficientes kilos te faltan:"+ cantidadsobrante*-1);
        }
    }
}

package Examen.examen;

import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        System.out.println("En este programa te dire si los numeros que metes estan ordenados o no introduce 3 numeros");
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int ordenadomayor, ordenadomenor;
       String resultado;
       
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        /*
         *  ordenado1 = num1 < num2 ? true : false;
        ordenado2 = num2 < num3 ? true : false;
        ordenado3 = ordenado1 && ordenado2 == true ? true : false;
        resultado = ordenado3 == true ? "Esta Ordenado" : "No esta ordenado";
        System.out.println(resultado);
        sc.close();
         * 
         */
         ordenadomayor = num1 > num2 && num2 > num3? 1 : 0;
        
         ordenadomenor = num1 < num2 && num2 < num3? 1 : 0;
         resultado= ordenadomayor < ordenadomenor ? "Esta Ordenado de menor a mayor" :  ordenadomayor==ordenadomenor ? "Esta desordenado": "Esta ordenado de mayor a menor" ;
        
        System.out.println(resultado);
        sc.close();
    }
}

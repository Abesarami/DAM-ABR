package ud4.ejercicios10012025;

import java.util.Arrays;
import java.util.Scanner;



public class EP0514_Sueldos {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa que te ayudara con la información de los salarios");
        Scanner sc = new Scanner(System.in);
        double salario;
        double[] listaSalario = new double[0];

        do {
            System.out.println("Introduce el sueldo. Si quieres parar introduce -1");
            salario = sc.nextDouble();
            if (salario != -1) {
                
                listaSalario = Arrays.copyOf(listaSalario, listaSalario.length+1);
                listaSalario[listaSalario.length-1] =salario;
                sc.nextLine();
            }
        } while (salario != -1);
        sc.close();
        Arrays.sort(listaSalario);
        
       
        System.out.println(Arrays.toString(listaSalario)+"este es la lista de salarios ordenada habria que darle la vuelta");
        

    }
}

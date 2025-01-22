package ud4.apuntes;

import java.util.Arrays;


public class ArraysEstadisticas {


    public static int suma(int t[]){
        int suma = 0;
        if (Esvalido(t)) {
             
        for (int i = 0; i < t.length; i++)
        suma = suma+t[i];       
                } else {
                System.out.println("arrayInvalido");
                }
        
        
        
        return suma;
            }
        
            private static boolean Esvalido(int[] t) {
               boolean valido = true;

// aqui falta todo






               return valido;
            }
        
            public static Integer minimo(int t[]) {
        if (t == null || t.length == 0)
            return null;

        Integer maximo = Integer.MAX_VALUE;

        for (int i = 0; i < t.length; i++)
            if (t[i] < maximo)
                maximo = t[i];

        return maximo;
    }
    public static Integer maximo(int t[]) {
        if (t == null || t.length == 0)
            return null;

        Integer maximo = t[0];

        for (int i = 0; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];

        return maximo;
    }
    static double mediana(int[] numeros){
        int[] t = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(t);
        double mediana=0;
        double numero1,numero2=0;
        if (t.length%2!=0) {
        numero1 =(int) t[t.length/2];
            mediana = t[(int) numero1];
        }else{
           
            numero1 = t[t.length/2];
            numero2 =  t[t.length/2-1];

            
            mediana = (numero1+numero2)/2;

        }


        return mediana;
    }

private static double media(int[] numeros) {
double media = suma(numeros) / numeros.length;
return media;
}
static int moda(int[] numeros) {
   int numeroRepetido=0;
   int num1,num2; 
   int[] t = Arrays.copyOf(numeros, numeros.length);
   Arrays.sort(t);
    for (int i = 0; i < t.length; i++){
        num1 = t[i];
        num2 = t[i+1];
         if (num1==num2) { 
            numeroRepetido=num1;
        }
            
        }
       
        return numeroRepetido;
    }





    
    public static void main(String[] args) {
// Declaración de variables y constantes
int[] numeros1 = {2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7};
int[] numeros2 = {2, 4, 6, 7, 4, 9, 2, 5, 6, 7};
// Proceso y salida
imprimeEstadisticas(numeros1);
imprimeEstadisticas(numeros2);
}
static void imprimeEstadisticas(int[] numeros) {
System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
System.out.println("---------------------------------------------");
System.out.println("Longitud: " + numeros.length);
System.out.println("Suma: " + suma(numeros));
System.out.println("Máximo: " + maximo(numeros));
System.out.println("Mínimo: " + minimo(numeros));
System.out.println("Media: " + media(numeros));
System.out.println("Mediana: " + mediana(numeros));
System.out.println("Moda: " + moda(numeros));
Arrays.sort(numeros);
System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
System.out.println("---------------------------------------------\n\n");
}


}

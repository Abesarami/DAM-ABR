package ud4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 *
 * Chuleta
 *
 * si quieres copiar un array la manera facil es usar Arrays.CopyOf((el array),(la longitud del array suele ser nombre.lenght))
 * hay muchas mas versiones de este metodo para poder copiar solo tramos
 * tambien puedes copiar clonandolo con nombreArrayClonado = nombreArray.clone() ¡TAMBIEN SE USA CON OBJETOS!
 *
 *
 */
public class Utilidades {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    // Generar un array de longitud dada con valores aleatorios entre min y max
    public static int[] generarArray(int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
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

    // Generar una matriz de tamaño dado con valores aleatorios entre min y max
    public static int[][] generarMatriz(int filas, int columnas, int min, int max) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matriz;
    }

    // Rellenar un array con valores introducidos por el usuario hasta que escriba
    // -1
    public static int[] rellenarArray() {
        System.out.println("Introduce números (-1 para terminar):");
        int[] temp = new int[100]; // Capacidad máxima temporal
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1)
                break;
            temp[count++] = num;
        }

        int[] resultado = new int[count];
        System.arraycopy(temp, 0, resultado, 0, count);
        return resultado;
    }

    // Suma los elementos de un array
    public static int sumar(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }

    // Encuentra el máximo valor en un array
    public static int maximo(int t[]) {
        if (t == null || t.length == 0)
            return 0;
        int maximo = t[0];
        for (int i = 1; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];
        return maximo;
    }

    // Rellenar una matriz con valores introducidos por el usuario
    public static int[][] rellenarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    // Imprimir un array
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Intercambiar dos posiciones en un array
    public static void intercambiarArray(int[] array, int i, int j) {
        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Intercambiar dos posiciones en una matriz
    public static void intercambiarMatriz(int[][] matriz, int fila1, int col1, int fila2, int col2) {
        if (fila1 >= 0 && fila1 < matriz.length && fila2 >= 0 && fila2 < matriz.length &&
                col1 >= 0 && col1 < matriz[0].length && col2 >= 0 && col2 < matriz[0].length) {
            int temp = matriz[fila1][col1];
            matriz[fila1][col1] = matriz[fila2][col2];
            matriz[fila2][col2] = temp;
        }
    }

    // Encuentra la columna con la mayor suma en una matriz
    public static int[] columnaMayorSuma(int[][] t) {
        int mayor = 0;
        int aux = 0;
        int valori = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                aux += t[i][j];
            }
            if (aux > mayor) {
                mayor = aux;
                valori = i;
            }
            aux = 0;
        }
        return t[valori];
    }

    // Recorrer una matriz por filas
    public static void recorrerPorFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recorrer una matriz por columnas
    public static void recorrerPorColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recorrer un array al revés
    public static void recorrerArrayReves(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Contar ocurrencias de un carácter en una cadena
    public static int contarCaracter(String cadena, char caracter) {
        int count = 0;
        for (char c : cadena.toCharArray()) {
            if (c == caracter)
                count++;
        }
        return count;
    }

    // Invertir una cadena
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Comparar dos cadenas
    public static boolean compararCadenas(String cadena1, String cadena2) {
        return cadena1.equals(cadena2);
    }

    // Comparar dos arrays
    public static boolean compararArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }

    // Comparar dos matrices
    public static boolean compararMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length)
            return false;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void ejemplosCharacter() {
        char ch = 'A';
        char num = '5';
        char space = ' ';

        System.out.println("isDigit('5'): " + Character.isDigit(num)); // Devuelve true porque '5' es un número
        System.out.println("isLetter('A'): " + Character.isLetter(ch)); // Devuelve true porque 'A' es una letra
        System.out.println("isLetterOrDigit('A'): " + Character.isLetterOrDigit(ch)); // Devuelve true porque 'A' es una letra
        System.out.println("isLetterOrDigit('5'): " + Character.isLetterOrDigit(num)); // Devuelve true porque '5' es un número
        System.out.println("isLowerCase('a'): " + Character.isLowerCase('a')); // Devuelve true porque 'a' está en minúscula
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(ch)); // Devuelve true porque 'A' está en mayúscula
        System.out.println("isSpaceChar(' '): " + Character.isSpaceChar(space)); // Devuelve true porque es un espacio
        System.out.println("isWhitespace('\t'): " + Character.isWhitespace('\t')); // Devuelve true porque '\t' es un espacio en blanco
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(ch)); // Convierte 'A' a 'a'
        System.out.println("toUpperCase('a'): " + Character.toUpperCase('a')); // Convierte 'a' a 'A'
    }
    public class StringFunctionsExample {
        public static void main(String[] args) {

            // 1. valueOf() - Convierte un valor a String
            int numero = 42;
            String strNumero = String.valueOf(numero);
            System.out.println("valueOf(): " + strNumero);

            // 2. equals() - Compara si dos cadenas son exactamente iguales (distingue mayúsculas)
            String str1 = "Hola";
            String str2 = "hola";
            System.out.println("equals(): " + str1.equals(str2)); // false

            // 3. equalsIgnoreCase() - Compara dos cadenas sin distinguir mayúsculas
            System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2)); // true

            // 4. regionMatches() - Compara una parte de dos cadenas
            String texto1 = "Hola Mundo";
            String texto2 = "Mundo";
            boolean regionIgual = texto1.regionMatches(5, texto2, 0, 5);
            System.out.println("regionMatches(): " + regionIgual); // true

            // 5. compareTo() - Compara cadenas lexicográficamente (según ASCII)
            System.out.println("compareTo(): " + str1.compareTo(str2)); // Devuelve negativo porque 'H' < 'h'

            // 6. compareToIgnoreCase() - Igual que compareTo, pero ignora mayúsculas
            System.out.println("compareToIgnoreCase(): " + str1.compareToIgnoreCase(str2)); // 0

            // 7. charAt() - Obtiene el carácter en una posición específica
            System.out.println("charAt(): " + str1.charAt(1)); // 'o'

            // 8. substring() - Extrae una parte de la cadena
            System.out.println("substring(): " + texto1.substring(5, 10)); // "Mundo"

            // 9. strip() - Elimina espacios en blanco al inicio y al final (Unicode-friendly)
            String textoConEspacios = "  Hola  ";
            System.out.println("strip(): '" + textoConEspacios.strip() + "'");

            // 10. stripLeading() - Elimina solo los espacios iniciales
            System.out.println("stripLeading(): '" + textoConEspacios.stripLeading() + "'");

            // 11. stripTrailing() - Elimina solo los espacios finales
            System.out.println("stripTrailing(): '" + textoConEspacios.stripTrailing() + "'");

            // 12. length() - Devuelve la cantidad de caracteres en la cadena
            System.out.println("length(): " + str1.length()); // 4

            // 13. indexOf() - Devuelve la primera posición de un carácter o cadena
            System.out.println("indexOf(): " + texto1.indexOf('o')); // 1

            // 14. lastIndexOf() - Devuelve la última posición de un carácter o cadena
            System.out.println("lastIndexOf(): " + texto1.lastIndexOf('o')); // 9

            // 15. isEmpty() - Verifica si una cadena está vacía
            String vacio = "";
            System.out.println("isEmpty(): " + vacio.isEmpty()); // true

            // 16. contains() - Verifica si una cadena contiene otra cadena
            System.out.println("contains(): " + texto1.contains("Mundo")); // true

            // 17. startsWith() - Verifica si una cadena empieza con otra
            System.out.println("startsWith(): " + texto1.startsWith("Hola")); // true

            // 18. endsWith() - Verifica si una cadena termina con otra
            System.out.println("endsWith(): " + texto1.endsWith("Mundo")); // true

            // 19. toLowerCase() - Convierte la cadena a minúsculas
            System.out.println("toLowerCase(): " + str1.toLowerCase()); // "hola"

            // 20. toUpperCase() - Convierte la cadena a mayúsculas
            System.out.println("toUpperCase(): " + str1.toUpperCase()); // "HOLA"

            // 21. replace() - Reemplaza caracteres en la cadena
            System.out.println("replace(): " + texto1.replace("Hola", "Hi")); // "Hi Mundo"

            // 22. split() - Divide la cadena en un array usando un delimitador
            String[] palabras = texto1.split(" ");
            System.out.println("split(): " + palabras[0] + ", " + palabras[1]); // "Hola, Mundo"
            // reglas generales:
            //
            //"" - indicar que una cadena contiene un numero de símbolos fijo.
            //         patrón "aaa" > cadenas con 3 a.
            //
            //
            //[] - opcionalidad > sólo un simbolo de los siguientes: ("[xyz]")
            //         patrón "aaa[xy]" > valida aaax y aaay
            //
            //
            //("[a-Z]","[A-Z]","[a-zA-Z]") admite cualquier caracter de esos
            //
            //
            //? puede aparecer una vez o ninguna
            //      a? aparece 0 o 1 veces
            //
            //
            //0, 1 o N veces
            // a* > aa, a, aaaaaaaa
            //
            //
            //+ - al menos 1, N
            //     a+ > al menos una a
            //
            //
            //{} - número mín y máx que un símbolo podrá repetirse. ("a{1,4}") "a" debe aparecer al menos una vez y como máximo 4
            //
            //
            //{2,} - sólo el mínimo
            //
            //
            //{5}  - numero exacto
            //
            //indicadores de repetición - "[a-z]{1,4}[0-9]+" > 1-4 letras minúsculas + un numero.
            // 23. toCharArray() - Convierte la cadena en un array de caracteres
            char[] caracteres = texto1.toCharArray();
            System.out.println("toCharArray(): " + caracteres[0] + ", " + caracteres[1]); // 'H', 'o'
        }
    }
    public class MatrizUtils {
        private int[][] matriz;
        private Random rand = new Random();
        private Scanner scanner = new Scanner(System.in);

        // Rellena la matriz con valores aleatorios dentro de un rango dado
        public void rellenarAleatoriamente(int min, int max) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rand.nextInt(max - min + 1) + min;
                }
            }
        }

        // Permite al usuario ingresar valores manualmente en la matriz
        public void rellenarPorTeclado() {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Ingrese valor para la posición [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        // Imprime la matriz en formato legible
        public void imprimirMatriz() {
            for (int[] fila : matriz) {
                System.out.println(Arrays.toString(fila));
            }
        }

        // Recorre la matriz por filas
        public void recorrerPorFilas() {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Recorre la matriz por columnas
        public void recorrerPorColumnas() {
            for (int j = 0; j < matriz[j].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Ordena cada fila de la matriz en orden ascendente
        public void ordenarFilas() {
            for (int[] fila : matriz) {
                Arrays.sort(fila);
            }
        }

        // Suma los valores de una fila específica
        public int sumaFila(int fila) {
            int suma = 0;
            for (int j = 0; j < matriz[j].length; j++) {
                suma += matriz[fila][j];
            }
            return suma;
        }

        // Suma los valores de una columna específica
        public int sumaColumna(int columna) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][columna];
            }
            return suma;
        }

        // Inserta un valor en una posición específica de la matriz
        public void insertarValor(int fila, int columna, int valor) {
            if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[fila].length) {
                matriz[fila][columna] = valor;
            } else {
                System.out.println("Posición fuera de rango.");
            }
        }

        // Encuentra el valor máximo en la matriz
        public int encontrarMaximo() {
            int max = matriz[0][0];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] > max) {
                        max = matriz[i][j];
                    }
                }
            }
            return max;
        }

        // Encuentra el valor mínimo en la matriz
        public int encontrarMinimo() {
            int min = matriz[0][0];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] < min) {
                        min = matriz[i][j];
                    }
                }
            }
            return min;
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
        // Calcula el promedio de todos los valores de la matriz
        public double promedioMatriz() {
            int suma = 0;
            int cantidadElementos = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    suma += matriz[i][j];
                     cantidadElementos = cantidadElementos+1;
                }
            }
            return (double) suma / cantidadElementos;
        }
    }
    public class ChuletaArrays {

        // Generar un array de enteros aleatorios
        public static int[] generarArrayEnteros(int longitud, int min, int max) {
            int[] array = new int[longitud];
            Random rand = new Random();
            for (int i = 0; i < longitud; i++) {
                array[i] = rand.nextInt((max - min) + 1) + min;
            }
            return array;
        }

        // Generar un array de Strings aleatorios
        public static String[] generateStringArray(int size) {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = "Str" + i;
            }
            return array;
        }

        // Imprimir un array
        public static void imprimirArray(int[] array) {
            System.out.println(Arrays.toString(array));
        }

        // Buscar un valor en un array ordenado (Binary Search)
        public static int binarySearch(int[] array, int value) {
            return Arrays.binarySearch(array, value);
        }

        // Buscar un valor en un array desordenado
        public static int linearSearch(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -1;
        }

        // Recorrer un array al derecho
        public static void recorrerArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Recorrer un array al revés
        public static void recorrerArrayAlReves(int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // Insertar un valor en un array
        public static int[] insertarValor(int[] array, int value) {
            int[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[array.length] = value;
            return newArray;
        }

        // Insertar un valor en un array ordenado
        public static int[] insertarValorOrdenado(int[] array, int value) {
            int[] newArray = insertarValor(array, value);
            Arrays.sort(newArray);
            return newArray;
        }

        // Eliminar un elemento de un array ordenado
        public static int[] eliminarValorOrdenado(int[] array, int value) {
            int index = binarySearch(array, value);
            if (index < 0) return array;
            return borrarIndice(array, index);
        }

        // Eliminar un elemento de un array desordenado
        public static int[] eliminarValorDesordenado(int[] array, int value) {
            int index = linearSearch(array, value);
            if (index < 0) return array;
            return borrarIndice(array, index);
        }

        //
        private static int[] borrarIndice(int[] array, int index) {
            int[] nuevoArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    nuevoArray[j++] = array[i];
                }
            }
            return nuevoArray;
        }

        //contar el numero de veces que aparece un valor
        public static int contar(int t[], int clave) {
            int contar = 0;

            for (int i = 0; i < t.length; i++)
                if (t[i] == clave)
                    contar++;

            return contar;
        }

        // Comparación de arrays
        public static boolean compararArrays(int[] array1, int[] array2) {
            return Arrays.equals(array1, array2);
        }

        // Uso de copyOf y copyOfRange
        public static void metodosCopia(int[] array) {
            int[] copiedArray = Arrays.copyOf(array, array.length);
            int[] rangeCopy = Arrays.copyOfRange(array, 1, array.length);
            System.out.println("Original: " + Arrays.toString(array));
            System.out.println("Copia: " + Arrays.toString(copiedArray));
            System.out.println("Copia de rango: " + Arrays.toString(rangeCopy));
        }
    }
    public static void main(String[] args) {
        // Ejemplo de uso
        int[] array = generarArray(10, 1, 100);
        imprimirArray(array);
        intercambiarArray(array, 0, array.length - 1);
        imprimirArray(array);

        int[][] matriz = generarMatriz(3, 4, 1, 50);
        imprimirMatriz(matriz);
        intercambiarMatriz(matriz, 0, 0, 2, 3);
        imprimirMatriz(matriz);

        System.out.println("Ocurrencias de 'a' en 'banana': " + contarCaracter("banana", 'a'));
        System.out.println("Invertir 'hola': " + invertirCadena("hola"));
        System.out.println("Comparar 'hola' y 'hola': " + compararCadenas("hola", "hola"));
    }
}

package ud3.ejemplos;
/*import ud3.ejemplos.Banco;/* */



public class BaInterfaz {
        public static void main(String[] args) {
           
            Banco b = new Banco( " Antonio ", " 72321342B ");
             b.Ingresar(100);
             b.Retirar(50);
            System.out.println(b.nombreYBalance()); 
        }
        
    }

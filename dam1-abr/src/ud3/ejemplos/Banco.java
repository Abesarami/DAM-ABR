package ud3.ejemplos;

public class Banco {
    
        //Datos 
        private String nombre;
        private String dni;
        private double balance = 0;
        
    
        public static int contadorCuentas;
        
    
        // CONSTRUCTORES
           
       
         
      
        Banco(String nombre, String dni) {                                                                     
            this.nombre = nombre;
            this.dni = dni;
            contadorCuentas++;
        }    
    
    
       
    
        
        public String nombreYBalance() {
               return nombre + dni +"tienes "+balance;
        }
        
        public String Ingresar(double dineroIngreso) {
            balance+=dineroIngreso;
            return "tu balance es "+balance;
               
        }
    
        public String Retirar(double dineroRetirar) {
            if (balance>dineroRetirar) {
                balance-=dineroRetirar;
                return "Tu balanace es "+balance;
            }else{
                return "No Hay pasta";
            }
        }
        
    
    }

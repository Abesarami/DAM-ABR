package ud3.abrexamen;

/*
 * Antonio Besada Ramilo
 */
public class JuegoCarreras01 {
    static int lineaMeta = 500;
    static int tirada;

    public static void main(String[] args) {
        System.out.println("RAYO");
        System.out.println("====");
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        rayo.mostrar();
        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        trueno.mostrar();

        while (rayo.getDistanciaRecorrida()<lineaMeta || trueno.getDistanciaRecorrida()<lineaMeta) {

            if (rayo.getVelocidadMaxima()>trueno.getVelocidadMaxima()||(rayo.getVelocidadMaxima()==trueno.getVelocidadMaxima()&&rayo.getTurbo()>trueno.getTurbo())) { //aqui lo que se esta haciendo es que el programa pueda decidir en caso de que los dos coches tengan la misma velocidad maxima mirando el turbo, el que tenga mas turbos ira primero
                if (rayo.getAutonomiaRestante()!=0) {
                   if ((tirada = (int) (Math.random() * (100 - 1 + 1)) + 1)<=25) {
                    rayo.usarTurbo();
                    System.out.println(rayo.getNombre()+"usa un turbo y avanza: "+rayo.getVelocidadMaxima()*1.5+" metros. Quedan "+rayo.getTurboRestante()+" turbos. (Total recorrido:"+rayo.getDistanciaRecorrida()+" metros");
                   }else{
                    rayo.avanzar();
                    System.out.println(rayo.getNombre()+"avanza"+"metros");
                    }

                }else{
                    rayo.repostar();
                    System.out.println("¡"+rayo.getNombre()+" para a repostar!");
                }
                if (trueno.getAutonomiaRestante()!=0) {
                    if ((tirada = (int) (Math.random() * (100 - 1 + 1)) + 1)<=25) {
                        trueno.usarTurbo();
                        System.out.println(trueno.getNombre()+"usa un turbo y avanza: "+trueno.getVelocidadMaxima()*1.5+" metros. Quedan "+trueno.getTurboRestante()+" turbos. (Total recorrido:"+trueno.getDistanciaRecorrida()+" metros");
                    }else{

                     trueno.avanzar();
                     System.out.println(trueno.getNombre()+"avanza"+"metros");
                    }
                }else{
                    trueno.repostar();
                        System.out.println("¡"+trueno.getNombre()+" para a repostar!");
                }
            }else{ 
                
                if (trueno.getAutonomiaRestante()!=0) {
                     if ((tirada = (int) (Math.random() * (100 - 1 + 1)) + 1)<=25) {
                         trueno.usarTurbo();
                     }else{
 
                      trueno.avanzar();
                      System.out.println(trueno.getNombre()+"avanza"+"metros");
                     }
                 }else{
                     trueno.repostar();
                            System.out.println("¡"+trueno.getNombre()+" para a repostar!");
                 }
                if (rayo.getAutonomiaRestante()!=0) {
                    if ((tirada = (int) (Math.random() * (100 - 1 + 1)) + 1)<=25) {
                     rayo.usarTurbo();
                     System.out.println(rayo.getNombre()+"usa un turbo y avanza: "+rayo.getVelocidadMaxima()*1.5+" metros. Quedan "+rayo.getTurboRestante()+" turbos. (Total recorrido:"+rayo.getDistanciaRecorrida()+" metros");
                    }else{
                     rayo.avanzar();
                     System.out.println(rayo.getNombre()+"avanza"+"metros");
                     }
 
                 }else{
                     rayo.repostar();
                     System.out.println("¡"+rayo.getNombre()+" para a repostar!");
                 }
                
            }
            
        }
        if (rayo.getDistanciaRecorrida()>=500) {
            System.out.println("¡"+rayo.getNombre()+" ha cruzado la linea de meta!");
        }else{
            System.out.println("¡"+trueno.getNombre()+" ha cruzado la linea de meta!");
        }
    }
}

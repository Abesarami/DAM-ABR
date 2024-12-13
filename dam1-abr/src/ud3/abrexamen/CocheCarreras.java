package ud3.abrexamen;

/*
 * Antonio Besada Ramilo
 */
public class CocheCarreras {
    private String nombre;
    private double velocidadMaxima;
    private double autonomia;
    private double autonomiaRestante;
    private double turbo = 3;
    private double turboRestante = turbo;
    private double distanciaRecorrida = 0;

    public CocheCarreras(String nombre, double velocidadMaxima, double autonomia) {
        this.nombre = nombre;
        if (velocidadMaxima >100) {
          this.velocidadMaxima = 100;
        }else{
            if (velocidadMaxima>=1) {
                this.velocidadMaxima = velocidadMaxima;  
            }else{
                this.velocidadMaxima = 1;
            }
        }
        
        this.autonomia = autonomia;
        this.autonomiaRestante=autonomia;
        this.turboRestante=3;
  
    }

    public CocheCarreras(String nombre, double velocidadMaxima, double turbo, double autonomia) {
        this.nombre = nombre;
        if (velocidadMaxima >100) {
            this.velocidadMaxima = 100;
          }else{
              if (velocidadMaxima>=1) {
                  this.velocidadMaxima = velocidadMaxima;  
              }else{
                  this.velocidadMaxima = 1;
              }
          }
        this.autonomia = autonomia;
        this.turbo = turbo;
        this.autonomiaRestante=autonomia;
        this.turboRestante=turbo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public double getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public double getTurbo() {
        return turbo;
    }

    public double getTurboRestante() {
        return turboRestante;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void avanzar() {
        int tirada = (int) (Math.random() * (velocidadMaxima - 1 + 1)) + 1;
        if (autonomiaRestante >= tirada) {
            distanciaRecorrida = distanciaRecorrida + tirada;
            autonomiaRestante = autonomiaRestante - tirada;
        } else {
            distanciaRecorrida = distanciaRecorrida + autonomiaRestante;
        }

    }

    public void usarTurbo() {
        if (turboRestante != 0 && turboRestante>0) {
          if ((velocidadMaxima * 1.5) <= autonomiaRestante) {
            this.distanciaRecorrida = distanciaRecorrida + velocidadMaxima * 1.5;
            this.turboRestante = turboRestante - 1;
            this.autonomiaRestante = autonomiaRestante - velocidadMaxima*1.5;
        } else {
            this.distanciaRecorrida = distanciaRecorrida + autonomiaRestante;
            this.autonomiaRestante = 0;
            turboRestante = turboRestante - 1;
        }  
        }
    }

    public void repostar() {
        autonomiaRestante = autonomia;
        turboRestante = turbo;
    }

    public void reiniciarDistancia() {
        distanciaRecorrida = 0;

    }

    public void mostrar() {
        System.out.println("Coche: " + nombre);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
        System.out.println("Turbos: " + turboRestante + "/" + turbo);
        System.out.println("Autonomía: " + autonomiaRestante + "/" + autonomia);
    }

    public static void main(String[] args) {
        System.out.println("RAYO");
System.out.println("====");
CocheCarreras rayo = new CocheCarreras("Rayo", 900, 400);
rayo.mostrar();
rayo.avanzar();
rayo.usarTurbo();
rayo.mostrar();
System.out.println("TRUENO");
System.out.println("======");
CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
trueno.mostrar();
while (trueno.getAutonomiaRestante() != 0)
trueno.usarTurbo();
trueno.mostrar();
trueno.repostar();
trueno.mostrar();
    }
}

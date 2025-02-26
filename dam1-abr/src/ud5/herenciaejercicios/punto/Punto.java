package ud5.herenciaejercicios.punto;

import java.util.Objects;

public class Punto {
    //Datos


   double posicionX = 0;
   double posicionY = 0;

public Punto(){
    posicionY=0;
    posicionX=0;
}
    public Punto(double posicionX ,double posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }
    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    public void setPosicion(double posicionX, double posicionY){
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }


    public String getPosicion() {
        
        return  posicionX+","+posicionY ;
    }
    public void desplazarPunto(double despX, double despY) {

        this.posicionX = this.posicionX + despX;
        this.posicionY = this.posicionY +despY;
    }
    
    public double getPosicionX() {
        return posicionX;
    }
    public double getPosicionY() {
        return posicionY;
    }
//    public double distancia(double posicionX,double posicionXdos,double posicionY,double posicionYdos){
//        double distanciaEuclidiana = Math.sqrt(Math.pow(posicionX - posicionXdos, 2) + Math.pow(posicionY - posicionYdos, 2));
//        return distanciaEuclidiana;
//    }+

    public double distancia(Punto b){
        double distanciaEuclidiana = Math.sqrt(Math.pow(posicionX - b.posicionX, 2) + Math.pow(posicionY - b.posicionY, 2));
    return distanciaEuclidiana;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return Double.compare(posicionX, punto.posicionX) == 0 && Double.compare(posicionY, punto.posicionY) == 0;
    }

    public static void main(String[] args) {
        Punto o = new Punto(5,5);
        Punto a = new Punto(5,5);
        o.setPosicion(5,5);
        a.setPosicion(5,5);
        System.out.println(o.equals(a));
        System.out.println(o.getPosicion());
    }
}

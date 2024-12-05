package ud3.propuestos;

public class Punto {
    //Datos 
    private int iD ;
    private static int contador;
    private double posicionX = 0;
    private double posicionY = 0;

    
    public Punto() {
        this.iD = contador++;     
    }
    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }
    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    public String getPosicion() {
        
        return "La posicion de el punto con id "+iD+" es "+posicionX+","+posicionY ;
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
    public static double distanciaEuclidiana(double posicionX,double posicionXdos,double posicionY,double posicionYdos){
        double distanciaEuclidiana = Math.sqrt(Math.pow(posicionX - posicionXdos, 2) + Math.pow(posicionY - posicionYdos, 2));
        return distanciaEuclidiana;
    }
    
    
}

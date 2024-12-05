package ud3.propuestos;

public class Punto {
    //Datos 
    private String iD;
    private double posicionX = 0;
    private double posicionY = 0;
    
    public Punto(String iD ) {
        this.iD = iD;
        
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    
    
}

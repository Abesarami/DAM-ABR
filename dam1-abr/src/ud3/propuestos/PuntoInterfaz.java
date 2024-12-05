package ud3.propuestos;

public class PuntoInterfaz {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.setPosicionX(10.2);
        p1.setPosicionY(5);
        p2.setPosicionX(4);
        p2.setPosicionY(13);
        System.out.println( p1.getPosicion());
        System.out.println( p2.getPosicion());
        System.out.println(Punto.distanciaEuclidiana(p1.getPosicionX(),p2.getPosicionX(),p1.getPosicionY(),p2.getPosicionY()));
        
        p1.desplazarPunto(4, 8);
        p2.desplazarPunto(6, 9);
        System.out.println( p1.getPosicion());
        System.out.println( p2.getPosicion());
        System.out.println(Punto.distanciaEuclidiana(p1.getPosicionX(),p2.getPosicionX(),p1.getPosicionY(),p2.getPosicionY()));

    }
}

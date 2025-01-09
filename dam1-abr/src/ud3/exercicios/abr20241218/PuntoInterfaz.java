package ud3.exercicios.abr20241218;

public class PuntoInterfaz {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.setPosicionX(11.2);
        p1.setPosicionY(25);
        p2.setPosicionX(31.2);
        p2.setPosicionY(52);
        System.out.println( p1.getPosicion());
        System.out.println( p2.getPosicion());
        System.out.println(Punto.distanciaEuclidiana(p1.getPosicionX(),p2.getPosicionX(),p1.getPosicionY(),p2.getPosicionY()));
        
        p1.desplazarPunto(0, 0);
        p2.desplazarPunto(0, 0);
        System.out.println( p1.getPosicion());
        System.out.println( p2.getPosicion());
        System.out.println(Punto.distanciaEuclidiana(p1.getPosicionX(),p2.getPosicionX(),p1.getPosicionY(),p2.getPosicionY()));

    }
}

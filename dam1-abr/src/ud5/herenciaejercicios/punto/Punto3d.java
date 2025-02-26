package ud5.herenciaejercicios.punto;

import java.util.Objects;

public class Punto3d extends Punto{
double posicionZ;


    public Punto3d(double posicionX, double posicionY,double posicionZ) {
        super(posicionX, posicionY);
        this.posicionZ=posicionZ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Punto3d punto3d = (Punto3d) o;
        return Double.compare(posicionZ, punto3d.posicionZ) == 0 && Double.compare(posicionX, punto3d.posicionX) == 0 && Double.compare(posicionY, punto3d.posicionY) == 0;
    }


    public double distancia(Punto3d b) {
        double distanciaEuclidiana = Math.sqrt(Math.pow(posicionX - b.posicionX, 2) + Math.pow(posicionY - b.posicionY, 2) + Math.pow(posicionZ - b.posicionZ ,2));
        return distanciaEuclidiana;
    }
}

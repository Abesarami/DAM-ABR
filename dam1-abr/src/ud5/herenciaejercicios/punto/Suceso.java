package ud5.herenciaejercicios.punto;

import java.util.Objects;

public class Suceso extends Punto3d {
    int tiempo;
    String descripcion;

    public Suceso(double posicionX, double posicionY, double posicionZ, int tiempo, String descripcion) {
        super(posicionX, posicionY, posicionZ);
        this.tiempo = tiempo;
        this.descripcion = descripcion;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Suceso suceso = (Suceso) o;
        return Double.compare(posicionX, suceso.posicionX) == 0 && Double.compare(posicionY, suceso.posicionY) == 0 && Double.compare(posicionZ, suceso.posicionZ) == 0 && tiempo == suceso.tiempo && Objects.equals(descripcion, suceso.descripcion);
    }

}

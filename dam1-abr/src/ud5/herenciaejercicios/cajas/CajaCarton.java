package ud5.herenciaejercicios.cajas;
import org.junit.jupiter.*;
public class CajaCarton extends caja {
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo);
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    public double getArea() {
        double area = ((alto * ancho) * 2) + ((alto * fondo) * 2);

        return area;
    }
    /*
    La empresa de mensajería BiciExpress, que reparte en bicicleta, para disminuir el
peso que transportan sus empleados solo utiliza cajas de cartón. El volumen de éstas se
calcula como el 80% del volumen real, con el fin de evitar que se deformen y se rompan.
Otra característica de las cajas de cartón es que sus medidas siempre están en
centímetros. Por último, la empresa, para controlar costes, necesita saber cuál es la
superficie total de cartón utilizado para construir todas las cajas.
Escribe la clase CajaCarton heredando de la clase Caja.


    * */



}

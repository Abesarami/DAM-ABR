package ud5.herenciaejercicios.cajas;

public class caja {


    /*
            Las empresas de transporte, para evitar daños en los paquetes, embalan todas
            sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un
            ancho, un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada
            una etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del
            destinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:
            ● Caja(int ancho, int alto, int fondo, Unidad unidad): que
            construye una caja con las dimensiones especificadas, que pueden encontrarse en
            “cm” (centímetros) o “m” (metros).
            ● double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
            ● void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de
            la caja.
            ● String toString(): que devuelve una cadena con la representación de la caja

            * */
    int ancho;
    int alto;
    int fondo;
    UNIDAD unidad;

    private enum UNIDAD {
        cm, m
    }

    public caja(int ancho, int alto, int fondo) {

        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = UNIDAD.cm;

    }

    public caja(int ancho, int alto, int fondo, UNIDAD unidad) {

        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;

    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getFondo() {
        return fondo;
    }

    public double getVolumen() {
        double volumen = ancho * alto * fondo;

if (unidad==UNIDAD.cm){
    volumen = volumen/1000;
}

        return volumen;
    }

    @Override
    public String toString() {
        return "caja{" +
                "ancho=" + ancho + unidad +
                " , alto=" + alto + unidad +
                " , fondo=" + fondo + unidad +
                " , volumen=" + getVolumen() + "metros" +
                '}';
    }
}

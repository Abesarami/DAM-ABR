package ud5.EjerciciosApuntes;

public class hora {
    /*
    E0801. Diseñar la clase Hora, que representa un instante de tiempo compuesto por la
hora (de 0 a 23) y los minutos. Dispone de los métodos:
● Hora (hora, minuto), que construye un objeto con los datos pasados como
parámetros.
● void inc(), que incrementa la hora en un minuto.
● boolean setMinuto (valor), que asigna un valor, si es válido, a los
minutos. Devuelve true o false según haya sido posible modificar los minutos o no.
● boolean setHora (valor), que asigna un valor, si está comprendido entre 0
y 23, a la hora. Devuelve true o false según haya sido posible cambiar la
hora o no.
     */

    int hora;
    int minutos;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void inc() {
        if (this.minutos < 59 && this.minutos > 0) {
            this.minutos = this.minutos + 1;
        } else{
            incHora();
            this.minutos = 0;
        } 
    }


    public void incHora() {
        if (this.hora < 23 && this.hora > 0) {
            this.hora = this.hora + 1;
        } else {
            this.hora = 0;
        }
    }

    @Override
    public String toString() {
        return "hora{" + "hora=" + hora + ", minutos=" + minutos + '}';
    }
    public static void main(String[] args) {
        hora h = new hora();
        h.setHora(23);
        h.setMinutos(59);
        h.inc();
        System.out.println(h.toString());
        
}
}
package ud5.inmobiliaria;


public abstract class Inmueble {
        String calle;
        int metros,habitaciones, baños;
        int precioVenta,precioAlquiler =0;

        public Inmueble(String calle, int metros, int habitaciones, int baños){
            this.calle = calle;
            this.metros = metros;
            this.habitaciones = habitaciones;
            this.baños = baños;
        }

    public String getCalle() {
        return calle;
    }

    public int getMetros() {
        return metros;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getPrecioAlquiler() {
            return precioAlquiler;
        }

        public void setPrecioAlquiler(int precioAlquiler) {
            this.precioAlquiler = precioAlquiler;
        }

        public int getPrecioVenta() {
            return precioVenta;
        }

        public void setPrecioVenta(int precioVenta) {
            this.precioVenta = precioVenta;
        }
        public abstract String detalle();

    }



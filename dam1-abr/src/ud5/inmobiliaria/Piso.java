package ud5.inmobiliaria;

public class Piso extends Inmueble {
        int numPlanta;
        public Piso(String calle, int metros, int habitaciones, int baños,int numPlanta) {

            super(calle, metros, habitaciones, baños);
            this.numPlanta = numPlanta;
        }

        @Override
        public String detalle() {
            if (precioAlquiler!=0 && precioVenta !=0) {
                return "Piso en: "+calle+"\n"+metros+"m^2, "+habitaciones+" habitaciones, "+baños+"baños, " + numPlanta+"ª palnta"+"\n"+"Con un precio de venta: "+precioVenta+"\n"+"con un precio de alquiler de: "+precioAlquiler;
            } else if (precioAlquiler!=0) {
                return "Piso en: "+calle+"\n"+metros+"m^2, "+habitaciones+" habitaciones, "+baños+"baños, " + numPlanta+"ª palnta" +"\n"+"con un precio de alquiler de: "+precioAlquiler;

            }else {
                return "Piso en: "+calle+"\n"+metros+"m^2, "+habitaciones+" habitaciones, "+baños+"baños, " + numPlanta+"ª palnta" +"\n"+"con un precio de Venta de: "+precioVenta;
            }

        }
    }

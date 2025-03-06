package ud5.inmobiliaria;

public class Casa extends Inmueble {

        int metrosTerreno;

        public Casa(String calle, int metros, int habitaciones, int baños,int metrosTerreno) {
            super(calle, metros, habitaciones, baños);
            this.metrosTerreno=metrosTerreno;
        }

        @Override
        public String detalle() {
            if (precioAlquiler!=0 && precioVenta !=0) {
                return "Casa en: "+calle+"\n"+metros+"m^2, "+habitaciones+" habitaciones, "+baños+"baños, " + metrosTerreno+" metros cuadrados de terreno"+"\n"+"Con un precio de venta: "+precioVenta+"\n"+"con un precio de alquiler de: "+precioAlquiler;
            } else if (precioAlquiler!=0) {
                return "Casa en: "+calle+"\n"+metros+"m^2, "+habitaciones+" habitaciones, "+baños+"baños, " + metrosTerreno+" metros cuadrados de terreno"+"\n"+"con un precio de alquiler de: "+precioAlquiler;

            }else {
                return "Casa en: "+calle+"\n"+metros+"m^2, "+habitaciones+" habitaciones, "+baños+"baños, " + metrosTerreno+" metros cuadrados de terreno"+"\n"+"con un precio de Venta de: "+precioVenta;
            }

        }
        }


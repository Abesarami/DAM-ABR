package ud5.rol;

import java.util.Arrays;

public class PersonajeEX extends Personaje {
    public int monedas;
    public item equipamiento[];
    public item manoDerecha;
    public item manoIzquierda;
    public item cabeza;
    public item cuerpo;


    public item[] inventario;

    public PersonajeEX(int fuerza, int agilidad, int constitucion, RAZAS raza, String nombre, int nivel, int experiencia, int puntosTot, int monedas, item[] inventario) {
        super(fuerza, agilidad, constitucion, raza, nombre, nivel, experiencia, puntosTot);
        this.inventario = inventario;
        this.monedas = monedas;

    }

    public PersonajeEX(int fuerza, int agilidad, int constitucion, RAZAS raza, String nombre, int monedas, item[] inventario) {
        super(fuerza, agilidad, constitucion, raza, nombre);
        this.inventario = inventario;
        this.monedas = monedas;
    }

    public PersonajeEX(String nombre, int monedas, item[] inventario) {
        super(nombre);
        this.inventario = inventario;
        this.monedas = monedas;
    }

    public PersonajeEX(String nombre, RAZAS raza, int monedas, item[] inventario) {
        super(nombre, raza);
        this.inventario = inventario;
        this.monedas = monedas;
    }

    public double getInventarioPeso() {
        double inventarioPeso = 0;
        for (int i = 0; i < inventario.length; i++) {
            inventarioPeso = inventarioPeso + inventario[i].getPeso();
        }
        return inventarioPeso;
    }

    public double getpesoMaximo() {
        double pesoMaximo = 50 + getConstitucion() * 2;
        return pesoMaximo;
    }


    public boolean addToInventario(item objeto) {
        boolean confirmacion = true;

        if (getInventarioPeso() + objeto.getPeso() > getpesoMaximo()) {
            confirmacion = false;
        } else {
            inventario = Arrays.copyOf(inventario, inventario.length + 1);
            inventario[inventario.length - 1] = objeto;
        }
        return confirmacion;
    }

    public String enseñarInventario() {
        String string = "";
        int numero;
        for (int i = 0; i < inventario.length; i++) {
            numero = i + 1;
            string = string + numero + " " + inventario[i].getNombreItem() + ", peso: " + inventario[i].getPeso() + ", precio: " + inventario[i].getValor() + "\n";
        }

        return string;
    }

    public String mostrarEquipamiento() {
        String listaEquipamiento = "";
        if (equipamiento[0] == null) {
            listaEquipamiento = "No tienes nada equipado";
        }
        int numero;
        for (int i = 0; i < equipamiento.length; i++) {
            numero = i + 1;
            listaEquipamiento = listaEquipamiento + numero + " " + inventario[i].getNombreItem() + ", peso: " + inventario[i].getPeso() + ", precio: " + inventario[i].getValor() + "\n";
        }


        return listaEquipamiento;
    }

    public boolean equipar(item objeto) {
        boolean comprobacion = false;
        if (objeto.getClass() == armadura.class) {
            if (equiparArmadura(objeto))
                comprobacion = true;
        } else {
            if (equiparArma(objeto))
                comprobacion = true;
        }
        return comprobacion;
    }

    private boolean equiparArma(item objeto) {
        boolean comprobacion = false;
        objeto = (arma) objeto;

        if (((arma) objeto).isDosmanos()) {
            if (manoDerecha == null && manoIzquierda == null) {
            manoDerecha = objeto;
            manoIzquierda = objeto;
            comprobacion = true;
            }

        } else if (manoDerecha==null) {
            manoDerecha=objeto;
            comprobacion = true;
        } else if (manoIzquierda==null) {
            manoIzquierda=objeto;
            comprobacion=true;
        }
        return comprobacion;
    }

    private boolean equiparArmadura(item objeto) {
        boolean comprobacion = false;
        objeto = (armadura) objeto;
        if (((armadura) objeto).getTipo()=="YELMO"){
            if (cabeza == null){
                cabeza = objeto;
                comprobacion = true;
            }
        } else if (((armadura) objeto).getTipo()=="ARMADURA") {
            if (cuerpo == null){
                cuerpo = objeto;
                comprobacion = true;
            }
        }else{
            if (manoIzquierda==null){
                manoIzquierda=objeto;
                comprobacion=true;
            }else if (manoDerecha==null){
                manoDerecha=objeto;
                comprobacion=true;
            }
        }

        return comprobacion;
    }
    public void desequipar(){
        manoDerecha = null;
        manoIzquierda = null;
        cabeza = null;
        cuerpo = null;
    }
    public String mostrarEquipo(){
        String equipo = "";
        equipo = "cabeza: "+cabeza.getNombreItem()+" cuerpo: "+cuerpo.getNombreItem()+" mano Derecha: "+manoDerecha.getNombreItem()+" mano Izquierda: "+manoIzquierda.getNombreItem();

        return equipo;
    }

}

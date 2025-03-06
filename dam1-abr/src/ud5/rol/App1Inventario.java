package ud5.rol;
import ud5.rol.*;
public abstract class App1Inventario {

    public static void main(String[] args) {
        String nombre = "arturo";
        item[] inventario = new item[0];
        int monedas = 0;
        PersonajeEX p1 = new PersonajeEX(nombre, monedas, inventario);
        item item1 = new miscelanea("Cota de malla", 10.0, 2000);
        item item2 = new miscelanea("Cota de malla", 10.0, 2000);
        item item3 = new miscelanea("Cota de malla", 10.0, 2000);
        item item4 = new miscelanea("Cota de malla", 10.0, 2000);
        item item5 = new miscelanea("Cota de malla", 10.0, 2000);
        item item6 = new miscelanea("Cota de malla", 10.0, 2000);
        item item7 = new miscelanea("Cota de malla", 10.0, 2000);

        System.out.println( p1.addToInventario(item1));
        System.out.println( p1.addToInventario(item2));
        System.out.println(  p1.addToInventario(item3));
        System.out.println(  p1.addToInventario(item4));
        System.out.println(  p1.addToInventario(item5));
        System.out.println(  p1.addToInventario(item6));
        System.out.println(  p1.addToInventario(item7));

        System.out.println(p1.enseñarInventario());

    }

}

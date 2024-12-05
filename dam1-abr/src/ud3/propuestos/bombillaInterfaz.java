package ud3.propuestos;

import ud3.propuestos.Bombilla;


public class bombillaInterfaz {
    public static void main(String[] args) {

        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();

        System.out.println(b1.estado());
        b1.encenderBombilla();
        System.out.println(b1.estado());
        Bombilla.apagarRegleta();
        System.out.println(b1.estado());
       
       
    }
}

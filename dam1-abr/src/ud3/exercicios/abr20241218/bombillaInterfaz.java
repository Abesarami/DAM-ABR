package ud3.propuestos;




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
       
        System.out.println(b2.estado());
        b2.encenderBombilla();
        System.out.println(b2.estado());
        Bombilla.apagarRegleta();
        System.out.println(b2.estado());
       
        System.out.println(b3.estado());
        b3.encenderBombilla();
        System.out.println(b3.estado());
        Bombilla.apagarRegleta();
        System.out.println(b3.estado());
       
       
    }
}

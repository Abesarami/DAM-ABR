package ud5.abrexamen;

import java.util.Arrays;
import java.util.Comparator;

//Antonio Besada Ramilo
public class Servidor extends Host {

    // Tu código aquí
    Servicio[] ListaServicios = new Servicio[0];
    int NumeroServicios = ListaServicios.length;

    public Servidor(String nombre, String ip, String mac) {
        super(nombre, ip, mac);
        Servicio[] ListaServicios = new Servicio[0];
    }

    public void addServicio(String nombre, int Puerto, String protocolo) {
        Servicio servicio = new Servicio(nombre, Puerto, protocolo);
        ListaServicios = Arrays.copyOf(ListaServicios, ListaServicios.length + 1);

        ListaServicios[ListaServicios.length - 1] = servicio;

    }

    @Override
    public String toString() {
        String string = nombre + " (" + ip + ")";
        for (int i = 0; i < ListaServicios.length; i++) {
            string = string + "*" + ListaServicios[i].nombre + " (" + ListaServicios[i].puerto + "/"
                    + ListaServicios[i].protocolo + ") ";
        }

        return string;
    }

    public int getNumeroServicios() {
        return NumeroServicios;
    }

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");

        Servidor[] servidores = {s1, s2, s3};
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        // Tu código aquí

        /*
         * System.out.
         * println("Aqui van los servidores ordenados por numero de servicios");
         * Arrays.sort(servidores,Comparator.comparing(Servidor::getNumeroServicios));
         * for (Servidor s : servidores) {
         * System.out.println(s);
         * }
         */
    }

}

package ud5.abrexamen;

import java.util.Arrays;

//Antonio Besada Ramilo
public class Host implements Comparable {

    // Tu código aquí
    String nombre;
    String ip;
    String mac;
    String Mascara_De_Red = "255.255.0.0";
    String Puerta_De_Enlace = "192.168.0.11";
    String Servidor_Dns = "192.168.0.9";

    public Host(String nombre, String ip, String mac) {
        this.nombre = nombre;

        this.ip = ip;

        if (validarMAC(mac)) {
            this.mac = mac;
        } else {
            throw new IllegalArgumentException(
                    "La mac no esta bien formateada el formato correcto es hh-hh-hh-hh-hh-hh o hh:hh:hh:hh:hh:hh");

        }
    }

    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean equals(Host obj) {
        boolean respuesta = false;
        if (this.mac == obj.mac) {
            respuesta = true;
        } else if (this.mac.toCharArray()[0] == obj.mac.toCharArray()[0]
                && this.mac.toCharArray()[1] == obj.mac.toCharArray()[1]
                && this.mac.toCharArray()[3] == obj.mac.toCharArray()[3]
                && this.mac.toCharArray()[4] == obj.mac.toCharArray()[4]
                && this.mac.toCharArray()[6] == obj.mac.toCharArray()[6]
                && this.mac.toCharArray()[7] == obj.mac.toCharArray()[7]
                && this.mac.toCharArray()[9] == obj.mac.toCharArray()[9]
                && this.mac.toCharArray()[10] == obj.mac.toCharArray()[10]
                && this.mac.toCharArray()[12] == obj.mac.toCharArray()[12]
                && this.mac.toCharArray()[13] == obj.mac.toCharArray()[13]
                && this.mac.toCharArray()[15] == obj.mac.toCharArray()[15]
                && this.mac.toCharArray()[16] == obj.mac.toCharArray()[16]) {
            respuesta = true;

        }

        return respuesta;
    }

    @Override
    public String toString() {
        return nombre + " (" + ip + " / " + mac + ").";
    }

    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h101, h100, h102, h103 };
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }

}

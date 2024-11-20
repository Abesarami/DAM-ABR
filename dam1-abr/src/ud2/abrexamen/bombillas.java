package ud2.abrexamen;

public class bombillas {
    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000, 100, 1));
    }

    public static String causaFinBombilla(int Horas, int Encendidos, int TiempoEncendido) {
        int horasMuerte = Encendidos * TiempoEncendido;
        String Resultado = "";

        if (TiempoEncendido >= 1 && TiempoEncendido <= 10 && Encendidos > 0) {
            if (Horas < horasMuerte) {
                Resultado = "HORAS";

            } else if (Horas > horasMuerte) {
                Resultado = "ENCENDIDOS";

            } else if (Horas == horasMuerte) {
                Resultado = "ENCENDIDOS + HORAS";
            }
        } else {
            Resultado = "Error";
        }

        return Resultado;
    }
}

package ud2.abrexamen;
// Antonio Besada Ramilo
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class bombillas {
    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000, 100, 1));
    }

    public static String causaFinBombilla(int Horas, int Encendidos, int TiempoEncendido) {
        int horasMuerte = Encendidos * TiempoEncendido;
        String Resultado = "";

        if (TiempoEncendido >= 1 && TiempoEncendido <= 10 && Encendidos > 0 && Horas>0 ) {
            if (Horas < horasMuerte) {
                Resultado = "HORAS";

            } else if (Horas > horasMuerte) {   
                Resultado = "ENCENDIDOS";

            } else if (Horas == horasMuerte) {
                Resultado = "ENCENDIDOS + HORAS";
            }
        } else {
            Resultado = "ERROR";
        }

        return Resultado;
    }
    @Test
    public void causaFinBombillaTest() {
    assertEquals("ERROR", causaFinBombilla(100, 100, 100));
    assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
    assertEquals("ERROR", causaFinBombilla(0, 10, 10));
    assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
    assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
    assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
    assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
    assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
    assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
    assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
    assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
    assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }
    
    
}

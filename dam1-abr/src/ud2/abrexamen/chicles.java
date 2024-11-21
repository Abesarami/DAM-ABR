package ud2.abrexamen;
//Antonio Besada Ramilo
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class chicles {
    public static void main(String[] args) {
        System.out.println(totalChicles(100, 2, 4));
    }

    public static int totalChicles(int chiclesCompra, int envoltoriosNecesarios, int Regalo) {
        int chiclesRegalo, chicles;

        if (envoltoriosNecesarios != 0) {
            if (Regalo < envoltoriosNecesarios && envoltoriosNecesarios > 0) {
                chiclesRegalo = chiclesCompra / envoltoriosNecesarios * Regalo;// 5

                chicles = chiclesCompra + chiclesRegalo;// 30
                if (chiclesRegalo >= envoltoriosNecesarios) {
                    int chiclesExtra = chiclesRegalo / envoltoriosNecesarios * Regalo;
                    chicles = chicles + chiclesExtra;
                }

            } else {
                chicles = -1;
            }
        } else {
            chicles = chiclesCompra;
        }

        return chicles;
    }
        @Test
        public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1 ));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        }
    }

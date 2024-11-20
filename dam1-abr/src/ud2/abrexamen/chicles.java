package ud2.abrexamen;

public class chicles {
    public static void main(String[] args) {
        System.out.println(totalChicles(20, 2, 5));
    }

    public static int totalChicles(int chiclesCompra, int EnvoltoriosNecesarios, int Regalo) {
        int chiclesRegalo, chicles;

        if (EnvoltoriosNecesarios != 0) {
            if (Regalo < EnvoltoriosNecesarios && EnvoltoriosNecesarios > 0) {
                chiclesRegalo = chiclesCompra / EnvoltoriosNecesarios * Regalo;// 5

                chicles = chiclesCompra + chiclesRegalo;// 30
                if (chiclesRegalo >= EnvoltoriosNecesarios) {
                    int chiclesExtra = chiclesRegalo / EnvoltoriosNecesarios * Regalo;
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
}
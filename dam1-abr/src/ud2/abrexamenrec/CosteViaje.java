package ud2.abrexamenrec;

/*
 * Antonio Besada Ramilo
 */
public class CosteViaje {

    public static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        double costeViaje = 0;
        double litrosGastados;
        switch (tipoCombustible) {
            case 0:
                litrosGastados = (consumoMedio / 100) * km;
                return costeViaje = litrosGastados * 1.521;

            case 1:
                litrosGastados = (consumoMedio / 100) * km;
                return costeViaje = litrosGastados * 1.435;

            case 2:
                double kWGastados = (consumoMedio / 100) * km;
                return costeViaje = kWGastados * 0.16591;

            default:
                return costeViaje;

        }

    }
}

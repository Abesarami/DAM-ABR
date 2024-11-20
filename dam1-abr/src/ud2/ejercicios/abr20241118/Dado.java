package ud2.ejercicios.abr20241118;

public class Dado {
    public static void main(String[] args) {
        final double NUM_LANZAMIENTOS = 99999999;
        int num1s = 0, num2s = 0, num3s = 0, num4s = 0, num5s = 0, num6s = 0;
        double porc1s, porc2s, porc3s, porc4s, porc5s, porc6s;

        System.out.println("Lanzando un dado " + NUM_LANZAMIENTOS + " veces");

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int cara = (int) (Math.random() * (6 - 1 + 1)) + 1;

            switch (cara) {
                case 1:
                    num1s++;
                    break;
                case 2:
                    num2s++;
                    break;
                case 3:
                    num3s++;
                    break;
                case 4:
                    num4s++;
                    break;
                case 5:
                    num5s++;
                    break;
                case 6:
                    num6s++;
                    break;
                default:
                    break;
            }
        }

        porc1s = (num1s * 100) / NUM_LANZAMIENTOS;
        porc2s = (num2s * 100) / NUM_LANZAMIENTOS;
        porc3s = (num3s * 100) / NUM_LANZAMIENTOS;
        porc4s = (num4s * 100) / NUM_LANZAMIENTOS;
        porc5s = (num5s * 100) / NUM_LANZAMIENTOS;
        porc6s = (num6s * 100) / NUM_LANZAMIENTOS;

        System.out.println("Han salido " + num1s + " unos" + "(" + porc1s + "%)");
        System.out.println("Han salido " + num2s + " doses" + "(" + porc2s + "%)");
        System.out.println("Han salido " + num3s + " treses" + "(" + porc3s + "%)");
        System.out.println("Han salido " + num4s + " cuatros" + "(" + porc4s + "%)");
        System.out.println("Han salido " + num5s + " cincos" + "(" + porc5s + "%)");
        System.out.println("Han salido " + num6s + " seises" + "(" + porc6s + "%)");
    }
}

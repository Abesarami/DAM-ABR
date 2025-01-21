package ud4.ejercicios21012025;

public class BuscarFilaMayorSuma {
    
    public static void ColumnaMayorSuma(int[][] t){
        int mayor = 0;
        int aux=0;
        int valori=0;
        for(int i = 0;i<t.length;i++){
            for (int j = 0; j < t[i].length; j++) {
                aux = aux+t[i][j];
            }
            if (aux>mayor) {
                mayor = aux;
                valori=i;
                
            }else if(aux==mayor){
                mayor = aux;
                valori=i;
                System.out.println("ha habido empate enseñaremos el ultimo que se ha visto");
            }
            aux = 0;
        }
        for(int i = 0; i < t.length; i++)
        System.out.print(t[i][valori]+" ");
    }
    public static void FilaMayorSuma(int[][] t){
        int mayor = 0;
        int aux=0;
        int valorj=0;
        for(int j = 0; j < t.length; j++){
            for (int i = 0;i<t[1].length;i++) {
                aux = aux+t[j][i];
            }
            if (aux>mayor) {
                mayor = aux;
                
                
            }else if(aux==mayor){
                mayor = aux;
                
                System.out.println("ha habido empate enseñaremos el ultimo que se ha visto");
            }
            aux = 0;
        }
        for(int i = 0; i < t[1].length; i++)
        System.out.print(t[valorj][i]+" ");
    }


    public static void main(String[] args) {
        int[][] t = {
            {5,7,3,5},
            {4,5,6,2},
            {11,13,8,2}

        };
       FilaMayorSuma(t);

    }
}

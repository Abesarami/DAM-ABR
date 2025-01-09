package ud3.exercicios.abr20241218;

public class Bombilla {
    //Datos
   

    private static boolean estadoRegleta =true;
    private  boolean estadoBombilla = false;
    
    public Bombilla() {
        
    }
    
    public Bombilla(boolean estadoBombilla) {
        this.estadoBombilla = estadoBombilla;
    }

    public static void apagarRegleta(){
        estadoRegleta = false;
    }

    public static void encenderRegleta(){
        estadoRegleta = true;
    }

    public void apagarBombilla() {
        this.estadoBombilla = true;
    }
    public void encenderBombilla() {
        this.estadoBombilla = true;
    }


    public boolean estado() {
        if (estadoRegleta) {
            return estadoBombilla;
        }
        else{
            return false; 
        }
        
    }


}

package UD6.FestivalDasMeigas;

import java.util.Arrays;
import java.util.Set;

public class Meiga {
    private String Nome = "";
    private String AlcumeMaxicos = "";
    //    private Feitizo[] FeitizosFav;
    private Set<Feitizo> FeitizosFav;

    public Meiga(String nome, String alcumeMaxicos, Set<Feitizo> feitizosFav) {
        Nome = nome;
        AlcumeMaxicos = alcumeMaxicos;
        FeitizosFav = feitizosFav;
    }

    public Meiga(String nome, String alcumeMaxicos) {
        Nome = nome;
        AlcumeMaxicos = alcumeMaxicos;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAlcumeMaxicos() {
        return AlcumeMaxicos;
    }

    public void setAlcumeMaxicos(String alcumeMaxicos) {
        AlcumeMaxicos = alcumeMaxicos;
    }

    public Set<Feitizo> getFeitizosFav() {
        return FeitizosFav;
    }

    public void setFeitizosFav(Set<Feitizo> feitizosFav) {
        FeitizosFav = feitizosFav;
    }

}

//    public Meiga(String nome, String alcumeMáxicos) {
//        Nome = nome;
//        AlcumeMáxicos = alcumeMáxicos;
//        FeitizosFav = new Feitizo[0];
//    }
//
//    public Meiga(String nome, String alcumeMáxicos, Feitizo[] feitizosFav) {
//        Nome = nome;
//        AlcumeMáxicos = alcumeMáxicos;
//        FeitizosFav = feitizosFav;
//    }
//
//    public boolean EngadirFeitizo(Feitizo f){
//        for (int i = 0; i < FeitizosFav.length; i++) {
//            if (FeitizosFav[i].equals(f)){
//                return false;
//            }
//        }
//        FeitizosFav = Arrays.copyOf(FeitizosFav , FeitizosFav.length);
//        FeitizosFav[FeitizosFav.length-1] = f;
//        return true;
//    }
//}

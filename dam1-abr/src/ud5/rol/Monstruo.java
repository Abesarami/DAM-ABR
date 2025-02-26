package ud5.rol;

public class Monstruo {
    /*
    . Crea una clase Monstruo con los atributos y métodos del diagrama.
○ Los métodos estaVivo() y perderVida() funcionarán igual que los de la clase
Personaje.
○ El método atacar() funciona como el método atacar() de la clase Personaje
pero utilizando los atributos ataque y defensa del Monstruo atacante en lugar
fuerza y agilidad del Personaje.
2. Sobrecarga el método atacar(Monstruo m) de la clase Personaje para poder atacar
a monstruos.
3. Crea las siguientes subclases de Monstruos: Orco, Troll, Aranha y Dragon. Define
en cada una constructores por defecto generarán monstruos más específicos con
valores aleatorios para sus atributos en los rangos que se indican en la tabla (el
atributo nombre es opcional):
Monstruo ataque defensa velocidad puntosVida
Orco 30-80 30-50 30-60 30-100
Troll 60-120 50-70 20-40 100-200
Aranha 10-50 20-40 40-70 30-80
Dragon 100-200 60-100 80-120 120-250
4. Crea un método mostrar() en la clase Monstruo similar al de la clase Personaje.
5. Redefine el método toString() de la clase Monstruo de modo que:
○ Muestre el nombre del Monstruo si lo tiene y su clase
○ En la misma línea, entre paréntesis mostrará los puntos de vida en el formato
de los siguientes ejemplos:
Orco (45)
Troll (180)
Smaug-Dragon (220)
6. Crea un método en la clase principal que genere y devuelva un monstruo
aleatoriamente, con las siguientes probabilidades:
40% de que sea un Orco
30% de que sea una Aranha
20% de que sea un Troll
10% de que sea un Dragon
Monstruo generaMonstruoAleatorio()
     */

    String nombre;
    int ataque;
    int defensa;
    int velocidad;
    int puntosVida;

    public Monstruo(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    public void atacar(Personaje a){
        
    }
}

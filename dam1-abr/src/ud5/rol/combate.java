package ud5.rol;

public class combate {

    //     2. Combate Singular
    // Añade a la clase Personaje los siguientes métodos:
    // ● byte sumarExperiencia(int puntos): incrementa la experiencia del
    // personaje. Si al incrementar la experiencia se supera un múltiplo de 1000 el
    // personaje sube de nivel. Un personaje puede subir varios niveles de golpe. El
    // método devuelve el número de niveles que sube el personaje.
    // ● void subirNivel(): incrementa en uno el nivel del personaje. Las
    // características físicas del personaje (fuerza, agilidad, constitución) se incrementan
    // en un 5%.
    // ● void curar(): restaura los puntos de vida a su valor original (constitución + 50).
    // (Salvo que los puntos de vida actuales sean mayores que ese valor, por ejemplo, por
    // haber tomado una poción o algo así).
    // ● boolean perderVida(int puntos): los puntos de vida del personaje se
    // reducen en la cantidad indicada. Si los puntos de vida del personaje llegan a (o
    // bajan de) cero el personaje muere y la función devuelve true.
    // ● boolean estaVivo(): devuelve true si el personaje tiene un número de puntos
    // de vida mayor que cero. Con cero puntos de vida se considera que el personaje
    // muere.
    // ● int atacar(Personaje enemigo): permite a un personaje atacar a otro con el
    // siguiente algoritmo:
    // ○ El personaje atacante utilizará una puntuación de ataque resultado de sumar
    // un número aleatorio entre 1 y 100 al valor de su atributo de fuerza.
    // ○ El personaje atacado o enemigo utilizará una puntuación de defensa
    // resultado de sumar un número aleatorio entre 1 y 100 al valor de su atributo
    // de agilidad.
    // ○ La diferencia entre la puntuación de ataque y la de defensa, si es positiva,
    // será el daño realizado y resultará en el número de puntos de vida que pierde
    // el personaje atacado y en el número de puntos de experiencia que suman
    // tanto el personaje atacante como el atacado. El daño no podrá ser
    // negativo ni mayor que los puntos de vida restantes del defensor. El valor se
    // ajustará a esos límites si es necesario.
    // ○ Si la diferencia es cero o negativa se entiende que el personaje atacante falla
    // o que el atacado esquiva o para el ataque.
    // ○ El método devolverá los puntos de daño.
    //


}

package ud3.propuestos;

public class persona {
    // Clase principal para ilustrar conceptos de objetos en Java

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 25);

        // Usar métodos del objeto
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Cambiar valores con setters
        persona.setNombre("Carlos");
        persona.setEdad(30);

        System.out.println("Nuevo Nombre: " + persona.getNombre());
        System.out.println("Nueva Edad: " + persona.getEdad());

        // Usar el método estático
        System.out.println("Número de personas creadas: " + Persona.getContadorPersonas());

        // Uso de herencia y polimorfismo
        Empleado empleado = new Empleado("Ana", 28, "Ingeniera", 50000);
        System.out.println(empleado.toString());

        // Llamar método sobrescrito
        System.out.println("Descripción: " + empleado.descripcion());

        // Llamar método específico de Empleado
        empleado.aumentarSalario(10); // Aumentar salario en un 10%
        System.out.println("Nuevo salario: " + empleado.getSalario());
    }
}

// Clase base
class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private static int contadorPersonas = 0;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método estático
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    // Método para sobrescribir en subclases
    public String descripcion() {
        return "Soy una persona llamada " + nombre + ", tengo " + edad + " años.";
    }
}

// Clase derivada (Herencia)
class Empleado extends Persona {
    // Atributos adicionales
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, String puesto, double salario) {
        super(nombre, edad); // Llamar al constructor de la clase base
        this.puesto = puesto;
        this.salario = salario;
    }

    // Métodos getter y setter
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método específico de la clase Empleado
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }


}



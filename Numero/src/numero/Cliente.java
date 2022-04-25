package numero;

public class Cliente {

    private String nombre;
    private int edad;
    public boolean atendido;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.atendido = false;
    }

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



    @Override
    public String toString() {
        return this.nombre + " con " + this.edad + " años. ";
    }
}
    


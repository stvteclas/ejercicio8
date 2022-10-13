package domain;

public class Persona {
    private String nombre;
    private int edad;
    private String telefono;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Pablo");
        persona.setEdad(25);
        persona.setTelefono("55443322");
        System.out.println("La persona creada es = " + persona.getNombre());
        System.out.println("su edad es = " + persona.getEdad());
        System.out.println("su telefono es = " + persona.getTelefono());
    }
}

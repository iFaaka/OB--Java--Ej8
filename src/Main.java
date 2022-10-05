public class Main {
    public static void main(String[] args) {
        Persona Juan = new Persona();
        Juan.setEdad(23);
        Juan.setNombre("Juan Pablo Ruiz");
        Juan.setTelefono(1158877789);

        System.out.println(Juan.getNombre());
        System.out.println(Juan.getEdad());
        System.out.println(Juan.getTelefono());
    }
}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
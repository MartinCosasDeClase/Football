public class Seleccio {

    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Seleccio(){
    }

    public Seleccio(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
    }

    public void Concentrarse(){
        System.out.println(this.Nombre + " se esta concentrando");
    }
    public void Viajar(){
        System.out.println(this.Nombre + " esta viajando");
    }
}

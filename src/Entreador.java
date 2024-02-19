public class Entreador extends Seleccio{
    private String idFederacion;

    public Entreador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println("El entrenador " + getNombre() + " esta dirigiendo un partido");
    }
    public void dirigirEntreno(){
        System.out.println("El entrenador " + getNombre() + " esta dirigiendo un entrene");
    }
}

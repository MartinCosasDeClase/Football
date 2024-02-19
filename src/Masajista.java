public class Masajista extends Seleccio{
    private String Titulacion;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion,int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        Titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    public void darMasaje(){
        System.out.println("El masajista " + getNombre() + " esta dando un masaje" );
    }
}

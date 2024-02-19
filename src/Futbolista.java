public class Futbolista extends Seleccio{
    private int dorsal;
    private String demarcacion;
    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido(){
        System.out.println(getNombre() + " esta jugando un partido");
    }
    public void entrenar(){
        System.out.println(getNombre() + "esta entrenando");
    }
}

public class Main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista(1, "Cristiano", "Ronaldo", 35, 7, "Delantero");
        Entreador e1 = new Entreador(2, "Luis", "Enrique", 50, "1234");
        Masajista m1 = new Masajista(3, "Pep", "Guardiola", 50, "Fisioterapeuta", 20);

        f1.Concentrarse();
        f1.Viajar();
        f1.jugarPartido();
        f1.entrenar();

        System.out.println("*********************");
        e1.Concentrarse();
        e1.Viajar();
        e1.dirigirPartido();
        e1.dirigirEntreno();

        System.out.println("***********************");
        m1.Concentrarse();
        m1.Viajar();
        m1.darMasaje();
    }
}
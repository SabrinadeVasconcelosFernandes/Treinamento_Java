package herencia;

public class EjemploPersonas {
    public static void main(String[] args) {
        Estudiante e = new Estudiante(101415, "Alex", "19.08.1988");
        e.dormir();
        e.aprobar();
        e.reprobar();
        e.respirar();
    }
}

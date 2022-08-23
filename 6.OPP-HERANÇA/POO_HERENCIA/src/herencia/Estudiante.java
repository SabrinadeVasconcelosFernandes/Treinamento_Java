package herencia;

public class Estudiante extends Persona{

    int numeroDeCuenta;

    Estudiante(int numeroDeCuenta, String nombre, String fechaDeNacimiento){
        super(nombre,fechaDeNacimiento);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    @Override
    void dormir(){
        //Soy Alex y estoy durmiendo
        super.dormir();

        //Soy Alex y yo no duermo, solo estudio
        System.out.println("Soy "+ nombre + " y yo no duermo, solo estudio");
    }

    void aprobar(){
        System.out.println("Me llamo " + nombre + " y aprobé mi examen");
    }

    void reprobar(){
        System.out.println("Me llamo " + nombre + " y reprobé mi examen");
    }

}

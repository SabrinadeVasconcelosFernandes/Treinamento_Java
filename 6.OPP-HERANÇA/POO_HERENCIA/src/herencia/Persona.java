package herencia;
public class Persona {

    String nombre;
    String fechaDeNacimiento;

    public Persona(String nombre, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    void dormir(){
        System.out.println("Soy "+ nombre + " y estoy durmiendo");
    }
    void respirar(){
        System.out.println("Estoy respirando desde " + fechaDeNacimiento);
    }
    void comer(){
        System.out.println(nombre + " está comiendo");
    }
}

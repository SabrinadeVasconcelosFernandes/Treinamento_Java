package polimorfismo.figuras;

public abstract class Figura {
    //atributos:
    private String color;

    //construtor:

    public Figura(){
        System.out.println("Uma forma canção! lalalala");
    }

    public Figura(String color) {
        this.color = color;
    }

    //métodos:
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

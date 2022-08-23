package polimorfismo.figuras;

public class Quadrado extends Figura{
    private double lado;

    public Quadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}

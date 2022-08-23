package polimorfismo.figuras;

public class Retangulo extends Figura implements Desenhavel{
    private double base;
    private double altura;

    public Retangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retangulo");
    }
}

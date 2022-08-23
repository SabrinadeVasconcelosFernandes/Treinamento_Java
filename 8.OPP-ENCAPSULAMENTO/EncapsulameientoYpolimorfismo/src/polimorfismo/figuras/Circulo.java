package polimorfismo.figuras;

public class Circulo extends Figura implements Desenhavel{

    //atributos:
    private double ratio;

    //contrutor
    public Circulo(String color, double ratio) {
        super(color);
        this.ratio = ratio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(ratio,2);
        //PI é uma cte ent escreve td maiusculo
        //pow é de power --> potencia
        //os argumentos de potencia são (valor, ao que o valor está sendo elevado)
        //ent por ex: 4 ao quadrado seria: Math.pow(4,2);
        //Nessa exepressão estamos escrevendo pi vezes o raio da circunferencia elevado ao quadrado, que é a area de um circulo;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um circulo");
    }
}

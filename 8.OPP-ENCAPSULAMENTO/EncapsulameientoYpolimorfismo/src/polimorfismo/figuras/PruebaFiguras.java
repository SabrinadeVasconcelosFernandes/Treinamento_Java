package polimorfismo.figuras;

public class PruebaFiguras {

    void imprimirArea(Figura figura){
        System.out.println("A cor da figura é " + figura.getColor() + " e essa figura tem a área igual à: " + figura.calcularArea());
    }

    public static void main(String[] args) {

        PruebaFiguras p = new PruebaFiguras();
        p.imprimirArea(new Circulo("Vermelho", 10.0));
        p.imprimirArea(new Quadrado("Verde", 125.2));
        p.imprimirArea(new Retangulo("Azul", 20,10));
    }
}

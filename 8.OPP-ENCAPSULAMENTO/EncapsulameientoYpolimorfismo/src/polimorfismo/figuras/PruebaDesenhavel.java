package polimorfismo.figuras;

public class PruebaDesenhavel {
    void provarDesenhar(Desenhavel desenhavel){
        desenhavel.desenhar();
    }
    public static void main(String[] args) {

        PruebaDesenhavel p = new PruebaDesenhavel();
        p.provarDesenhar(new Circulo("Verde", 10.5f));
        p.provarDesenhar(new Retangulo("Vermelho", 10.5f, 2.4f));
        p.provarDesenhar(new Imagem());
    }
}

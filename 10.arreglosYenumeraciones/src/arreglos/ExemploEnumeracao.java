package arreglos;

enum SaborPalomitas{
    CHILE("Chile", 12.0f), MANTEQUILLA("Mantequilla", 23.0f), QUESO("Quesito", 15.0f), CARAMELO("Caramelito", 10.0f);

    //atributos:
    private String nomeDeVenda;
    private float preco;

    //construtor:
    private SaborPalomitas(String nomeDeVenda, float preco){
        this.nomeDeVenda = nomeDeVenda;
        this.preco = preco;
    }

    //métodos
    public String getNomeDeVenda() {
        return nomeDeVenda;
    }

    public float getPreco() {
        return preco;
    }
}

public class ExemploEnumeracao {
    public static void main(String[] args) {
        SaborPalomitas caramelo = SaborPalomitas.CARAMELO;
        System.out.println(caramelo.name());
        System.out.println(caramelo.getNomeDeVenda());
        System.out.println(caramelo.getPreco());
    }
}

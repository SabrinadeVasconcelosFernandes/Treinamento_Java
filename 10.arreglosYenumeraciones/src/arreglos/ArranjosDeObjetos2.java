package arreglos;

//criando a classe Tacos:
class Taco2{
    //atributos
    private String sabor;
    private float preco;
    private boolean cebola;
    private boolean cilantro;

    //construtor
    public Taco2(String sabor, float preco, boolean cebola, boolean cilantro) {
        this.sabor = sabor;
        this.preco = preco;
        this.cebola = cebola;
        this.cilantro = cilantro;
    }


    //getterse setters
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    public boolean isCilantro() {
        return cilantro;
    }

    public void setCilantro(boolean cilantro) {
        this.cilantro = cilantro;
    }
}

public class ArranjosDeObjetos2 {
    public static void main(String[] args) {
        //INICIALIZAÇÃO INPLICITA
        Taco2 pedido[] = {
                new Taco2("Carne",15.40f,true,false),
                new Taco2("Frango",10.0f,false,false),
                new Taco2("Arranchera",20.0f,false,true)
        };

        float conta = 0.0f;

        for (Taco2 taco :
                pedido) {
            System.out.println("Sabor: "+taco.getSabor());
            System.out.println("Preço: "+taco.getPreco());
            System.out.println("Cebola: "+taco.isCebola());
            System.out.println("Cilantro: "+taco.isCilantro());
            System.out.println("\n");
            conta+=taco.getPreco();
        }
        System.out.println("Total: " + conta);

    }
}

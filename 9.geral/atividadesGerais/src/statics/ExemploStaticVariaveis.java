package statics;

import java.util.Arrays;

class Humano{

    //atributos
    static int numeroDeHumanos = 0;
    String nome;

    //construtor
    public Humano(){
        System.out.println("construtor padrão");

    }
    public Humano(String nome){
        this.nome = nome;
        System.out.println("construtor com nome: " + nome);
    }

    //bloco anônimo - tudo que eu colocar aqui vai rodar pra qqr construtor
    {
        numeroDeHumanos++;
        System.out.println("bloco anônimo");
    }
}

public class ExemploStaticVariaveis {

    public static void main(String[] args) {
        System.out.println("Quantidade de humanos: " + Humano.numeroDeHumanos);
        new Humano();
        new Humano();
        new Humano();
        new Humano("mari");
        System.out.println("Quantidade de humanos: " + Humano.numeroDeHumanos);
        new Humano();
        new Humano();
        new Humano("Julia");
        new Humano();
        new Humano("fefo");
        new Humano();
        System.out.println("Quantidade de humanos: " + Humano.numeroDeHumanos);

        //apesar de eu estar construindo objetos diferentes, o programa conta todos elas por que a propriedade que faz isso não está nos construtores, mas em um bloco anônimo.

    }
}

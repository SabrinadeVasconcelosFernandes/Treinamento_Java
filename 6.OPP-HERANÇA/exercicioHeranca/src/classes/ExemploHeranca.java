package classes;

class Animal{
    //atributos
    String nome;

    //metodo
    public void respirar(){
        System.out.println("Soy un animal y estoy respirando");
    }
}

class Perro extends Animal{
    public void corre(){
        System.out.println("o Cachorro " + nome + " está correndo.");
    }

}

class Gato extends Animal{
    public void dorme(){
        System.out.println("o classes.Gato " + nome + " está dormindo.");
    }
}

public class ExemploHeranca {
    public static void main(String[] args) {

        Perro caramelo = new Perro();
        //estou usando um método de classes.Animal por que a minha classe classes.Perro herda esse método da classe classes.Animal
        caramelo.respirar();
        caramelo.nome = "Caramelo";
        caramelo.corre();

        Gato sardinha = new Gato();
        sardinha.respirar();
        sardinha.nome="Sardinha";
        sardinha.dorme();
    }
}

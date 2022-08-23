package polimorfismo.automoveis;

public class Moto extends Automoveis{
    //atributos
    public String passageiro;

    //constructor
    public Moto(String color, int rodas, String passageiro) {
        super(color, rodas);
        this.setRodas(2);
        this.passageiro = passageiro;
    }

    //metodos
    @Override
    public String darCarona() {
        return "Motos tem "+getRodas()+" rodas." +"\nNessa moto de cor " +getColor()+ ", eu vou das carona para " + passageiro;
    }

}

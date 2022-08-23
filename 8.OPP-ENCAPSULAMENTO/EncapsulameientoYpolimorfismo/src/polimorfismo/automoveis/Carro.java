package polimorfismo.automoveis;

public class Carro extends Automoveis implements Musical{
    //atributos
    public String passageiro1;
    public String passageiro2;
    public String passageiro3;

    //construtor
    public Carro(String color, int rodas, String passageiro1, String passageiro2, String passageiro3) {
        super(color, rodas);
        this.setRodas(4);
        this.passageiro1 = passageiro1;
        this.passageiro2 = passageiro2;
        this.passageiro3 = passageiro3;
    }

    //metodos
    @Override
    public String darCarona() {
        return "Carros tem "+getRodas()+" rodas." +"\nNesse carro de cor " +getColor()+ ", eu vou das carona para meus amigos: " + passageiro1 + ", " + passageiro2 + ", e " +passageiro3;
    }

    @Override
    public void tocarMusica() {
        System.out.println("O carro "+getColor()+" está tocando a música 'Bad Girls' da Donna Summer.");
    }
}

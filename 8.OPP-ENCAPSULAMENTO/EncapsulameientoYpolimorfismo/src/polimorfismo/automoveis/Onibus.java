package polimorfismo.automoveis;

public class Onibus extends Automoveis implements Musical{
    public String nomeDaEscola;

    public Onibus(String color, int rodas, String nomeDaEscola) {
        super(color, rodas);
        setRodas(8);
        this.nomeDaEscola = nomeDaEscola;
    }

    //metodos
    @Override
    public String darCarona() {
        return "Ônibus tem "+getRodas()+" rodas." +"\nNesse ônibus de cor " +getColor()+ ", estão sendo levados os alunos da " + nomeDaEscola;
    }

    @Override
    public void tocarMusica() {
        System.out.println("O ônibus "+getColor()+" está tocando a música 'As it was' do Harry Styles.");
    }
}

package polimorfismo.automoveis;

public class ProvaAutomoveis {
    void infoAuto(Automoveis automoveis){
        System.out.println("Info sobre o automovel: " + automoveis.darCarona());
    }
    void tocaMusica(Musical musical){
        musical.tocarMusica();
    }
    public static void main(String[] args) {

        //criando um objeto do tipo provaAutomoveis:
        ProvaAutomoveis p = new ProvaAutomoveis();

        //carros - tem duas formas de fazer: Você pode criar o objeto e depois só referenciar, como o carroVerde
        //ou você pode criar o objeto na hora que você usar os métodos dessa classe

        Carro carroVerde = new Carro("verde", 4, "Suzana", "Miguel", "Angeline");

        p.infoAuto(new Carro("lilás", 4, "Maria", "Pedro", "João"));
        p.tocaMusica(new Carro("rosa", 4, "Kamilly", "Bruna", "Beatriz"));
        p.infoAuto(carroVerde);
        p.tocaMusica(carroVerde);

        //motos - tem duas formas de fazer: Você pode criar o objeto e depois só referenciar, como a motoAzul,
        //ou você pode criar o objeto na hora que você usar os métodos dessa classe
        //as motos não implementam a interface Musical, então elas nã usam o método tocaMusica();
        Moto motoAzul = new Moto("Azul brilhante", 2, "Marcelo");
        p.infoAuto(motoAzul);
        p.infoAuto(new Moto("laranja cintilante", 2, "Adriane"));

        //onibus - tem duas formas de fazer: Você pode criar o objeto e depois só referenciar, como o onibusAmarelo,
        //ou você pode criar o objeto na hora que você usar os métodos dessa classe
        Onibus onibusAmarelo = new Onibus("amarelo", 8, "Escola Municipal de Santa Maria da Luz Verde");
        p.infoAuto(onibusAmarelo);
        p.tocaMusica(onibusAmarelo);

        p.infoAuto(new Onibus("verde agua", 8, "Escola Estadual da Rocinha do Burro Manco"));
        p.tocaMusica(new Onibus("azul claro", 8, "Universidade São pedro dos Leiteiros com fome"));

    }
}

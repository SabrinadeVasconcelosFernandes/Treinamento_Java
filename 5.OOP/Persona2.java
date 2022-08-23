class Persona2{
  //Atributos - caracteristicas:
  String nome;
  int idade;
  char genero;

  //Métodos - ações:
  void imprimirInformacao(){
    System.out.println("Nome: " +nome);
    System.out.println("Idade: " +idade);
    System.out.println("Gênero: " +genero);
  }

  void jogarVideoGames(Persona2 p){
    System.out.println(nome + " está jogando com " + p.nome);
  }

  //void --> valor de retorno (no caso, vazio)

  public static void main(String[] args) {

    Persona2 p1 = new Persona2();
    p1.nome = "Alex";
    p1.idade = 31;
    p1.genero = 'M';

    Persona2 p3 = new Persona2();
    p3.nome = "Ana";
    p3.idade = 31;
    p3.genero = 'F';

    //Alex está jogando com a Ana:
    p1.jogarVideoGames(p3);





  }

}

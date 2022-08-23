class Persona{
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
  //void --> valor de retorno (no caso, vazio)

  public static void main(String[] args) {
    //criando um objeto:
    //nome da classe | identificador |  = new | nome da classe ();
    Persona p1 = new Persona();

    //definindo os atributos do objeto
    p1.nome = "Alex";
    p1.idade = 31;
    p1.genero = 'M';

    //invocando o método para imprimir os dados dessa pessoa
    p1.imprimirInformacao();

    Persona p2 = new Persona();
    p2.nome = "John";
    p2.idade = 22;
    p2.genero = 'M';
    p2.imprimirInformacao();

    Persona p3 = new Persona();
    p3.nome = "Ana";
    p3.idade = 31;
    p3.genero = 'F';
    p3.imprimirInformacao();

  }

}

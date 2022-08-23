class Persona{
  //Atributos - caracteristicas:
  String nome;
  int idade;
  char genero;

  //construtores
  Persona(){
    System.out.println("Construtor por defeito");
    //posso criar construtores com os mesmos nomes contanto que não tenham os mesmos parametros. Este construtor não está mais sendo usado mas se eu construisse um objeto e não passasse nenhum parametro pra ele, esse é o construtor que ele rodaria.
  }

  Persona(String nome, int idade, char genero){
    this();  //chama o primeiro construtor
    this.nome = nome;
    this.idade = idade ;
    this.genero = genero ;
  }

  //Métodos - ações:
  void imprimirInformacao(){
    System.out.println("Nome: " +nome);
    System.out.println("Idade: " +idade);
    System.out.println("Gênero: " +genero);
  }
  void jogarVideoGames(Persona p){
    System.out.println(nome + " está jogando com " + p.nome);
  }

  public static void main(String[] args) {

    Persona p1 = new Persona("Alex", 31, 'M');
    p1.imprimirInformacao();

    Persona p2 = new Persona("John", 22, 'M');
    p2.imprimirInformacao();

    Persona p3 = new Persona("Ana", 31, 'F');
    p3.imprimirInformacao();

    //Alex está jogando com a Ana:
    p1.jogarVideoGames(p3);

    //John está jogando com a Alex:
    p2.jogarVideoGames(p1);

    //Ana está jogando com a John:
    p3.jogarVideoGames(p2);

  }

}

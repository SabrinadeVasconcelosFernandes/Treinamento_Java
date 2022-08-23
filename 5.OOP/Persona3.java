class Persona3{
  //Atributos - caracteristicas:
  String nome;
  int idade;
  char genero;

  //construtores
  Persona3(){
    System.out.println("Esto és un construtor");
    //posso criar construtores com os mesmos nomes contanto que não tenham os mesmos parametros. Este construtor não está mais sendo usado mas se eu construisse um objeto e não passasse nenhum parametro pra ele, esse é o construtor que ele rodaria.
  }

  Persona3(String n, int id, char g){
    nome = n;
    idade = id;
    genero = g;
  }

  //Métodos - ações:
  void imprimirInformacao(){
    System.out.println("Nome: " +nome);
    System.out.println("Idade: " +idade);
    System.out.println("Gênero: " +genero);
  }
  void jogarVideoGames(Persona3 p){
    System.out.println(nome + " está jogando com " + p.nome);
  }

  public static void main(String[] args) {

    Persona3 p1 = new Persona3("Alex", 31, 'M');
    p1.imprimirInformacao();

    Persona3 p2 = new Persona3("John", 22, 'M');
    p2.imprimirInformacao();

    Persona3 p3 = new Persona3("Ana", 31, 'F');
    p3.imprimirInformacao();

    //Alex está jogando com a Ana:
    p1.jogarVideoGames(p3);

    //John está jogando com a Alex:
    p2.jogarVideoGames(p1);

    //Ana está jogando com a John:
    p3.jogarVideoGames(p2);

  }

}

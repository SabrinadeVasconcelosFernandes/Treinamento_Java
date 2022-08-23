//Seccion 4 - Control del flujo - exercicio uno
//Realiza un programa de multiplicar dle 1 al 20, debe existir un espacio entre una y otra para identificarlas.
class S4ex1{
  public static void main(String[] args){
    int j = 0;
    for (j=0; j<=20; j++) {
      System.out.println("\n" + "TABUÁDA DO " + j);
      for (int i=0; i<=10; i++) {
        System.out.println(j + " x " + i + " = " + (j*i));
      }
    }
  }
}

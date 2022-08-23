//Seccion 4 - Control del flujo - exercicio uno
//Modifica el programa anterior para que solo se impriman las tablas de multiplicar de numeros pares
class S4ex2{
  public static void main(String[] args){
    int x = 2;
    int j = 0;
    
    for (j=0; j<=20; j++) {
      System.out.println("\n" + "TABUÁDA DO " + j);
      for (int i=0; i<=10; i++) {
        System.out.println(j + " x " + i + " = " + (j*i));
      }
    }
  }
}

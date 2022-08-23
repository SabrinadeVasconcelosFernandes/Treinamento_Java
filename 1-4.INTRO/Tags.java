class Tags{
//tags são utilizadas para poder romper um ciclo especifico
//vamos criar as tags outer e inner
  public static void main(String[] args){
    int j = 0;
    outer: for (j=0; j<10; j++) {
      System.out.println("\n" + "TABUÁDA DO " + j);
      inner: for (int i=0; i<=10; i++) {
        if (j==3) {
          break outer; // não vai imprimir da tabuada do três em diante
        }
        else if (i==5) {
          break inner; // não vai multiplicar nenhum numero por 5 em diante
        }

        System.out.println(j + " x " + i + " = " + (j*i));
      }
    }
  }
}

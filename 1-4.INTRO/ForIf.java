//  TABUÁDA DO DOIS -- somente pares

class ForIf{
  public static void main(String[] args) {
    int tabla = 2; //intervalo --> de dois em dois
    for(int i=0; i<=10;i++){
      if (i%2==0) {
        continue;
      }
      System.out.println(tabla + " x " + i + " = " + (tabla*i));
    }
  }
}

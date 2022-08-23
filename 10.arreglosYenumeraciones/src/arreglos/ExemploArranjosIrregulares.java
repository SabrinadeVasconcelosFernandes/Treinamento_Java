package arreglos;
/*
* Vamos montar esse arranjo:
* 10
* 10 20
* 30 40 50
* 50 60
* */
public class ExemploArranjosIrregulares {
    public static void main(String[] args) {

        //1) definir quantas colunas vai ter:
        int arreglo[][] = new int[4][];

        //2) definir as linhas uma por uma:
        arreglo[0] = new int[1];
        arreglo[1] = new int[2];
        arreglo[2] = new int[3];
        arreglo[3] = new int[2];

        //3) inserindo os valores de cada casa:
        arreglo[0][0] = 10;
        arreglo[1][0] = 10;
        arreglo[1][1] = 20;
        arreglo[2][0] = 30;
        arreglo[2][1] = 40;
        arreglo[2][2] = 50;
        arreglo[3][0] = 50;
        arreglo[3][1] = 60;

        //4) imprimir os valores é igual aos outros arranjos:
        for(int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo[i].length; j++){
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

package arreglos;

public class ExemploArranjosMultidimensionais {
    public static void main(String[] args) {
        //criando a matriz:
        int arranjo[][] = new int[2][2];

        //preenchendo com valores:
        arranjo[0][0] = 10;
        arranjo[0][1] = 20;
        arranjo[1][0] = 30;
        arranjo[1][1] = 40;

        //imprimindo valores - um em baixo do outro:
        System.out.println("imprimindo valores - um em baixo do outro:");
        for(int i = 0; i < arranjo.length; i++){
            for (int j = 0; j < arranjo[i].length; j++){
                System.out.println(arranjo[i][j]);
            }
        }

        System.out.println();

        //imprimindo valores - como uma matriz:
        System.out.println("imprimindo valores - como uma matriz:");
        for(int i = 0; i < arranjo.length; i++){
            for (int j = 0; j < arranjo[i].length; j++){
                System.out.print(arranjo[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

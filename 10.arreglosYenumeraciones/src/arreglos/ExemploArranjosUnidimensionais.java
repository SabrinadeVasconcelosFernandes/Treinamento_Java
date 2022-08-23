package arreglos;

public class ExemploArranjosUnidimensionais {
    public static void main(String[] args) {

        //criando a array
        int array[] = new int[3];

        //armazenando valores
        array[1] = 24;
        array[0] = 13;
        array[2] = 34;

        //imprimindo valores - forma 1
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //imprimindo valores - forma 2 - usando for
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        //imprimindo valores - forma 3 - usando o while
        int i = 0;
        while (i<array.length){
            System.out.println(array[i]);
            i++;
        }

        //imprimindo valores - forma 3 - usando For each
        for (int temp:array){
            System.out.println(temp);
        }
    }
}

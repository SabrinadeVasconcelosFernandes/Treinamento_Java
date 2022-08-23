package arreglos;
//Inicializando arranjos
//existem três formas de se inicializar um arranjo:

public class InicializacionDeArreglos {

    static void imprimirArranjo(String arranjo[]){
        for (String valor :
                arranjo) {
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        //Explicita
        String nomes[] = new String[2];
        nomes[0] = "Sabs";
        nomes[1] = "Kabs";

        //Implicita
        String nomes2[] = {"Sabs", "Kabs"};

        //Anônima
        String nomes3[] = new String[]{"Sabs", "Kabs"};


        //para imprimir eu posso referenciar:
        imprimirArranjo(nomes);
        imprimirArranjo(nomes2);

        //ou instanciar na hora:
        imprimirArranjo(new String[]{"Sabs", "Kabs"});
    }
}

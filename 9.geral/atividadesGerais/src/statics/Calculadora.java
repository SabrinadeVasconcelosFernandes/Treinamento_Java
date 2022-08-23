package statics;

import java.util.Arrays;

public class Calculadora {
    static int soma(int x, int y){
        return x + y ;
    }
    public static void main(String[] args) {

        System.out.println("Soma = " + soma(3,5));

        /*
        se o int soma não for static, eu preciso fazer assim:
        Calculadora c = new Calculadora();
        System.out.println(c.soma(5,5););
        */
    }
}

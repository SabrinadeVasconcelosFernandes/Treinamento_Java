package statics;

//criando classe A
class A{
    //criando método foo:
    static void foo(){
        System.out.println("Foo1");
    }
}

//criando classe B
class B extends A{
    //B está sobrescrevendo o método Foo de A:
   static void foo(){
        System.out.println("Foo2");
    }
}

public class StaticYPolimorfismo {
    public static void main(String[] args) {
        //fazendo um objeto ultilizando o polimorfismo:
        A a = new B();
        a.foo();
        // vai imprimir foo2 quando ambos métodos foo (de A e B) não forem static;
        // vai dar erro quando somente o método foo de A for static;
        // vai imprimir foo1 quando ambos os métodos foo (de A e B) forem static
        // por que a invocação de um static não depende da criação de um objeto;
    }
}

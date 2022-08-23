package polimorfismo.automoveis;

public abstract class Automoveis {
    //atributos
    private String color;
    private int rodas;

    //constructor
    public Automoveis(String color, int rodas) {
        this.color = color;
        this.rodas = rodas;
    }

    //metodos
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    //método abstrato
    public abstract String darCarona();
}

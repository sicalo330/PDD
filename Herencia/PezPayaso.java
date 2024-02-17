package Herencia;

public class PezPayaso extends Acuatico {

    public PezPayaso(String color) {
        super(color);
    }

    @Override
    public void respirar() {
        System.out.println("Soy un pez payaso y respiro con mis branquias");
    }

    @Override
    public void comer() {
        System.out.println("Soy un omnívoro y como insectos del entorno, pequeños peces o algas que encuentro en el camino");
    }

    @Override
    public void desplazarse(int p) {
        System.out.println("Yo nado gracias a mi aleta, un halcón  ");
    }
}

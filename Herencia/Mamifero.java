package Herencia;

public class Mamifero extends Animal {
    private int mamas;

    public Mamifero(String color) {
        super(color);
    }

    public void desplazarse(int p) {
        System.out.println("Animal desplazandose");
    }

    public int getMamas(){
        return mamas;
    }

}

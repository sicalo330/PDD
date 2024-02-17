package Herencia;

abstract class Mamifero extends Animal {
    private int mamas;

    public Mamifero(String color) {
        super(color);
    }

    public int getMamas(){
        return mamas;
    }

    abstract void desplazarse(int p);

}

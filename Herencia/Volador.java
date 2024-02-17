package Herencia;

abstract class Volador extends Animal {
    private int alas;

    public Volador(String color) {
        super(color);
    }

    public int getAlas(){
        return alas;
    }

    abstract void aterrizaje();


}

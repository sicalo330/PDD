package Herencia;

abstract class Animal {
    private String color;

    public Animal(String color){
        this.color = color;
    }

    abstract void desplazarse(int p);

    abstract void comer();

    public String getColor(){
        return color;
    }
}

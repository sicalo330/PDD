package Herencia;

abstract class Animal {
    private String color;

    public Animal(String color){
        this.color = color;
    }

    abstract public void desplazarse(int p);

    public String getColor(){
        return color;
    }
}

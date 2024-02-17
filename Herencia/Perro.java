package Herencia;

public class Perro extends Mamifero {

    public Perro(String color) {
        super(color);
    }
    public void caminar(){
        System.out.println("Perro caminando");
    }

    public void desplazarse(int p){
        System.out.println("Perro camina " + p + " pasos");
    }
}

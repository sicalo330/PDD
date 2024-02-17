package Herencia;

public class Gato extends Mamifero {
    public Gato(String color) {
        super(color);
    }

    public void caminar(){
        System.out.println("Gato caminando");
    }

    public void desplazarse(int p){
        caminar();
        System.out.println("Gato se desplazo " + p + " pasos");
    }
}

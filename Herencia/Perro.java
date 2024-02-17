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
    @Override
    public void comer() {
        System.out.println("Soy omnivoro y me encanta comer de todo, algunas comidas más que otras claro");;
    }
}

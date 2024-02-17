package Herencia;

public class Main {
    public static void main(String[] args){
        Gato gato = new Gato("Gris oscuro");
        gato.desplazarse(10);

        Perro perro = new Perro("Blanco amarillento");
        perro.desplazarse(25);
    }
}

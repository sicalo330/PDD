package Herencia;

public class Main {
    public static void main(String[] args){
        Gato gato = new Gato("Gris oscuro");
        gato.desplazarse(10);
        gato.caminar();
        gato.comer();

        Perro perro = new Perro("Blanco amarillento");
        perro.desplazarse(25);
        perro.caminar();
        perro.comer();

        PezPayaso pezP = new PezPayaso("Naranja");
        pezP.comer();
        pezP.respirar();
        pezP.desplazarse(30);

        Gaviota gaviota = new Gaviota("Blanco");
        gaviota.aterrizaje();
        gaviota.comer();
    }
}

package Herencia;

public class Gaviota extends Volador {

    public Gaviota(String color) {
        super(color);
    }

    @Override
    public void aterrizaje() {
        System.out.println("Extiendo mis alas, saco mis patas y suavemente desciendo hasta llegar a la tierra");
    }

    @Override
    public void desplazarse(int p) {
        System.out.println("Soy capaz de volar");
    }

    @Override
    public void comer() {
        System.out.println("Soy omnivoro y me encantan los peces, encontré un pez payaso que paseaba por ahí, espero que no me haya visto");
    }

}

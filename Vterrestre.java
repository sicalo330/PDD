public class Vterrestre extends Vehicle {
    private int tires = 4;

    public Vterrestre(){
        System.out.println("Desde el constructor Vehiculo terrestre");
    }

    public void acelerar(){
        System.out.println("El vehiculo terrestre acelera en terreno seco");
    }

    public int getTires() {
        return tires;
    }
}

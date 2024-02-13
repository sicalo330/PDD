public class Vehicle {
    private Double maxSpeed = 500.50;

    public Vehicle(){
        System.out.println("Desde el constructor Vehicle");
    }

    public void pitar(){
        System.out.println("PII PIII");
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }
}

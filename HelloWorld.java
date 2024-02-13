class HelloWorld{
    public static void main(String[] args){
        Vterrestre vt = new Vterrestre();
        Vacuatico va = new Vacuatico();
        Car c = new Car();
        Bike b = new Bike();
        Boat bo = new Boat();

        System.out.println(vt.getTires());
        System.out.println(vt.getMaxSpeed());

        System.out.println(va.getMaxSpeed());
        va.pitar();
        System.out.println("\n");

        c.pitar();
        c.acelerar();
        System.out.println(c.getMaxSpeed());
        System.out.println(c.getTires());

        System.out.println("\n");

        b.pitar();
        b.acelerar();
        System.out.println(b.getMaxSpeed());
        System.out.println(b.getTires());

        System.out.println("\n");

        bo.pitar();
        bo.flotar();
        System.out.println(bo.getMaxSpeed());


    }
}
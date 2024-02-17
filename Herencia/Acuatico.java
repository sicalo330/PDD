package Herencia;

abstract class Acuatico extends Animal {
    //Se refiere a qué utilizan para obtener su hidrodinamica
    private int extensionHidrodinamica;

    public Acuatico(String color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    abstract void respirar();

    abstract void comer();

    public int getExtensionHidrodinamica(){
        return extensionHidrodinamica;
    }
}

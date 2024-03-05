public final class Singleton {
    private static Singleton instance;
    public static Singleton primeraInstancia;
    public String value;
    public static int aux = 0;
    private static int limite; // Nuevo campo para almacenar el límite

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value, int limiteParam) {
        limite = limiteParam;
        if (instance == null || aux <= limite) {
            instance = new Singleton(value);
            aux++;
        }
        return instance;
    }

    public static Singleton getAnotherInstance(String value) {
        if (aux == 1) {
            primeraInstancia = new Singleton(value);
            System.out.println(primeraInstancia);
            aux++;
        }
        if (instance == null || aux <= limite) {
            instance = new Singleton(value);
            aux++;
        }
        if(aux > limite) {
			return primeraInstancia;
        }
        return instance;
    }

}
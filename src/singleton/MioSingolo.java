package singleton;

public class MioSingolo {
	
	private static MioSingolo istanza = null;

    //Il costruttore private impedisce l'istanza di oggetti da parte di classi esterne
    private MioSingolo() {
    	System.out.println("Singleton instanziato! hashcode: " + hashCode());
    }

    // Metodo della classe impiegato per accedere al singleton
    public static synchronized MioSingolo getMioSingolo() {
        if (istanza == null) {
            istanza = new MioSingolo();
        }
        return istanza;
    }

}

package interpreter;

public class Main {
	
	//Regola: Roberto e Giovanni sono uomini
    public static Espressione getUomo(){
        Espressione roberto = new EspressioneTerminale("Roberto");
        Espressione gianni = new EspressioneTerminale("Gianni");
        return new EspressioneOr(roberto, gianni);
    }

    //Regola: Giulia è sposata
    public static Espressione getSposata(){
        Espressione giulia = new EspressioneTerminale("Giulia");
        Espressione sposata = new EspressioneTerminale("Sposata");
        return new EspressioneAnd(giulia, sposata);
    }

    public static void main(String[] args) {
        Espressione isUomo = getUomo();
        Espressione isSposata = getSposata();

        System.out.println("[MAIN]: Gianni e' uomo? -&gt; " + isUomo.interpreta("Gianni"));
        System.out.println("[MAIN]: Giulia e' sposata?  -&gt; " + isSposata.interpreta("Giulia Sposata"));
    }

}

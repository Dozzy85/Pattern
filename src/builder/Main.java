package builder;

public class Main {

	public static void main(String[] args) {
		
		Negozio negozio=new Negozio.Builder(1234)
				.setIndirizzo("via Roma 1")
				.setProprietario("Pinco Pallo")
				.setInCentroCommerciale(false)
				.build();
	}

}

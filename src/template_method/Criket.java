package template_method;

public class Criket extends Game {

	@Override
	void inizializza() {
		System.out.println("Il gioco è stato inizializzato");
		
	}

	@Override
	void startPlay() {
		System.out.println("Il gioco è iniiziato");
		
	}

	@Override
	void endPlay() {
		System.out.println("Il gioco è finito");
		
	}
	
	

}

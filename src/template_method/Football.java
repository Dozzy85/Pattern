package template_method;

public class Football extends Game {

	@Override
	void inizializza() {
		System.out.println("Il gioco � stato inizializzato");

	}

	@Override
	void startPlay() {
		System.out.println("Il gioco � iniiziato");

	}

	@Override
	void endPlay() {
		System.out.println("Il gioco � finito");

	}

}

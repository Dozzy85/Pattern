package template_method;

public abstract class Game {

	abstract void inizializza();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void paly() {

		// inizializza il gioco
		inizializza();

		// inizia il gioco
		startPlay();

		// ferma il gioco
		endPlay();
	}

}

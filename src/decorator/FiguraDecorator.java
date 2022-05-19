package decorator;

//Decorator
public class FiguraDecorator implements Figura {

	protected Figura figura;

	public FiguraDecorator(Figura figura) {
		this.figura = figura;
	}

	@Override
	public void operazione() {
		figura.operazione();
	}

}

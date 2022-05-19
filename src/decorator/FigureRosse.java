package decorator;

//Concrete Decorator
public class FigureRosse extends FiguraDecorator {

	public FigureRosse(Figura figura) {
		super(figura);
	}

	@Override
	public void operazione() {
		figura.operazione();
		setBordoRosso();
	}
	
	public void setBordoRosso() {
		System.out.println("Colore bordo rosso");
	}

}

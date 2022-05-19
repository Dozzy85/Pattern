package factory;

public class FiguraFactory {
	
	public Figura getFigura(String figuraType) {
		if(figuraType==null) {
		return null;
		}
		if(figuraType.equalsIgnoreCase("Cerchio")) {
			return new Cerchio();
		}
		if(figuraType.equalsIgnoreCase("Quadrato")) {
			return new Quadrato();
		}
		if(figuraType.equalsIgnoreCase("Rettangolo")) {
			return new Rettangolo();
		}
		return null;
	}

}

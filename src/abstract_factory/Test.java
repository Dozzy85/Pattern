package abstract_factory;

public class Test {

	public static void main(String[] args) {
		
		FiguraFactory factory = new MiaFiguraFactory();
		Figura c=factory.createCerchio();
		Figura r=factory.createRettangolo();
		
		c.disegna();
		r.disegna();
		

	}

}

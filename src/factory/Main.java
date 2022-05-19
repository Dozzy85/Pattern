package factory;

public class Main {

	public static void main(String[] args) {
		
		FiguraFactory factory=new FiguraFactory();
		
		Figura fig1=factory.getFigura("Cerchio");
		fig1.stampa();
		
		Figura fig2=factory.getFigura("Quadrato");
		fig2.stampa();
		
		Figura fig3=factory.getFigura("Rettangolo");
		fig3.stampa();

	}

}

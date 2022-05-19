package interpreter;

public class EspressioneAnd implements Espressione {

	private Espressione espr1 = null;
	private Espressione espr2 = null;

	public EspressioneAnd(Espressione expr1, Espressione expr2) {
		this.espr1 = expr1;
		this.espr2 = expr2;
	}

	@Override
	public boolean interpreta(String contesto) {
		return espr1.interpreta(contesto) && espr2.interpreta(contesto);
	}

}

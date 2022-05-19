package interpreter;

public class EspressioneOr implements Espressione {

	private Espressione expr1 = null;
	private Espressione expr2 = null;

	public EspressioneOr(Espressione espr1, Espressione espr2) {
		this.expr1 = espr1;
		this.expr2 = espr2;
	}

	@Override
	public boolean interpreta(String contesto) {
		return expr1.interpreta(contesto) || expr2.interpreta(contesto);
	}

}

package interpreter;

public class EspressioneTerminale implements Espressione {

	private String data;

	public EspressioneTerminale(String data) {
		this.data = data;
	}

	@Override
	public boolean interpreta(String contesto) {
		if (contesto.contains(data)) {
			return true;
		}
		return false;
	}

}

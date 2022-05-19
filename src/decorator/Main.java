package decorator;

public class Main {

	public static void main(String[] args) {

		Figura cerchio = new Cerchio();
		Figura cerchioRosso = new FigureRosse(cerchio);

		Figura rettangoloRosso = new FigureRosse(new Rettangolo());

		System.out.println("--Cerchio normale--");
		cerchio.operazione();

		System.out.println("--Cerchio bordo rosso--");
		cerchioRosso.operazione();

		System.out.println("--Rettangolo bordo rosso--");
		rettangoloRosso.operazione();

	}

}

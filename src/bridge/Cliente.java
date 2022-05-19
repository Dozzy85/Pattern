package bridge;

public class Cliente {

	public static void main(String[] args) {

		Cameriere[] cameriere = new Cameriere[2];

		cameriere[0] = new CamerierePizzeria();
		Pasto pasto = cameriere[0].ordinazione(new PizzaMargherita());
		System.out.println(pasto);

		cameriere[1] = new CameriereRistorante();
		pasto = cameriere[1].ordinazione(new PastaPomodoro());
		System.out.println(pasto);
	}

}

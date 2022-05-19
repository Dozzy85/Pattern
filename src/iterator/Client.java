package iterator;

public class Client {

	public static void main(String[] args) {

		Aggregatore aggregatore = new AggregatoreConcreto();
		aggregatore.add("dato numero 1");
		aggregatore.add("dato numero 2");
		MioIteratore iteratore = aggregatore.creaIteratore();
		while (iteratore.hasNext())
			System.out.println(iteratore.next());

	}

}

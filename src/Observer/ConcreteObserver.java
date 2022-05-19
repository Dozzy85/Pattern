package Observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("Sono "+this+" il Subject è stato modificatp");

	}

}

package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {

	private List<Observer> list = new ArrayList<>();

	public void addObserver(Observer observer) {
		list.add(observer);
	}

	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : list) {
			observer.update();
		}
	}
}

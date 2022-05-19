package iterator;

import java.util.*;

public class AggregatoreConcreto implements Aggregatore {

	private ArrayList array;

	public AggregatoreConcreto() {
		array = new ArrayList();
	}

	@Override
	public MioIteratore creaIteratore() {
		return new IteratoreConcreto(array);
	}

	@Override
	public void add(String dato) {
		array.add(dato);
	}

}

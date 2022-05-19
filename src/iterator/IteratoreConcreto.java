package iterator;

import java.util.*;

public class IteratoreConcreto implements MioIteratore {

	private ArrayList array;
	private int attuale = -1;

	public IteratoreConcreto(ArrayList array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return (attuale + 1) < array.size();
	}

	@Override
	public Object next() {
		attuale++;
		return array.get(attuale);
	}

}

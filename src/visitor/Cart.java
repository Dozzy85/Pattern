package visitor;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<CartItem> items;

	public Cart() {
		items = new ArrayList<>();
	}

	public void add(CartItem book) {
		items.add(book);
	}

	public double getTotal() {
		double total = 0;
		for (CartItem item : items) {
			total += item.getPrice();
		}
		return total;
	}

	public List<CartItem> getItems() {
		return items;
	}

}

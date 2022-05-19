package visitor;

public class CartTotal implements CartItemVisitor {

	private double total;
	private Cart cart;

	public CartTotal(Cart cart) {
		this.cart = cart;
		this.total = 0;
	}

	@Override
	public void visit(Book book) {
		total += book.getPrice();

	}

	@Override
	public void visit(Dvd dvd) {
		total += dvd.getPrice();

	}

	public double getTotal() {
		for(CartItem item: cart.getItems()) {
			item.accept(this);
		}
		return total;
	}

}

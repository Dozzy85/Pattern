package visitor;

public class Book implements CartItem{

	private String title;
	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public void accept(CartItemVisitor visitor) {
		visitor.visit(this);
		
	}

}

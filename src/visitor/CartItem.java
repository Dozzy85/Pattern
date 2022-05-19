package visitor;

public interface CartItem {

	public double getPrice();
	public void accept(CartItemVisitor visitor);

}

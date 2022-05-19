package visitor;

public class ShoppingCartDriver {

	public static void main(String[] args) {

		Cart cart = new Cart();
		Book book = new Book("Cime Tempestose", 23.12);

		cart.add(book);
		cart.add(book);

		CartTotal cartTotla = new CartTotal(cart);
		System.out.println("Total=" + cart.getTotal());
		System.out.println("Total=" + cartTotla.getTotal());

	}

}

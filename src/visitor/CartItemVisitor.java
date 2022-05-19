package visitor;

public interface CartItemVisitor {
	
	public void visit(Book book);
	public void visit(Dvd dvd);

}

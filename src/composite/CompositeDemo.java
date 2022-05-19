package composite;

public class CompositeDemo {

	public static void main(String[] args) {

		Triangolo t = new Triangolo();
		Quadrato q = new Quadrato();
		
		Drawing d1=new Drawing();
		d1.add(t);
		d1.add(q);
		d1.draw();

	}

}

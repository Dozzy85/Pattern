package template_method;

public class Main {

	public static void main(String[] args) {
		
		Game game=new Criket();
		game.paly();
		System.out.println();
		game=new Football();
		game.paly();

	}

}

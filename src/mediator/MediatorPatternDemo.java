package mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User robert=new User("Rober");
		User jhon=new User("Jhon");
		
		robert.sendMessage("Hi Jhon");
		jhon.sendMessage("Hi Robert");
	}

}

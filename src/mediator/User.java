package mediator;

public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String unNome) {
		this.name = unNome;
	}
	
	public void sendMessage(String message) {
		ChatRoom.showMessage(this,message);
	}
}

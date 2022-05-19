package flyweight;

public class ConcreteFlyweightCharacter implements FlyweightCharacter {

	Character character = null;

	// stato interno
	public ConcreteFlyweightCharacter(Character character) {
		this.character = Character.toUpperCase(character);
	}

	public Character operation() {
		return character;
	}

	// stato esterno
	public void setColor(String color) {
		System.out.println("Colore: " + color);
	}

}

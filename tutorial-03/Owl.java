public class Owl extends Animal{

	// is the owl wise or not?
	private boolean wise;

	public Owl(String name, int birthYear, boolean wise) {
		// Use Animal's constructor
		super(name, birthYear);
		this.wise = wise;
	}

	@Override
	public String noise() {
		return "hoooo";
	}

	@Override
	public String toString(){
		if (wise) {
			return super.toString() + " is wise.";
		} else {
			return super.toString() + " is not wise.";
		}
	}
}
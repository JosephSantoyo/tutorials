public class Hooty extends Owl {
	private boolean wise;

	public Hooty(String name, int birthYear, boolean wise) {
		super(name, birthYear, wise);
	}

	@Override
	public String noise() {
		return "hoo-tee!";
	}
}
public class Tooty extends Owl {
	private boolean wise;

	public Tooty(String name, int birthYear, boolean wise) {
		super(name, birthYear, wise);
	}

	@Override
	public String noise() {
		return "Too-tee!";
	}
}
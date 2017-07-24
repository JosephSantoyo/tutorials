public class Tabby extends Cat {
	public Tabby(String name, int birthYear) {
		super(name, birthYear);
	}

	@Override
	public String noise() {
		double r = Math.random();

		// 50% chance to return meow or prrr each time noise is called.
		if (r < 0.5) {
			return "meeeeeee";
		} else {
			return "reeeeeee";
		}
	}
}
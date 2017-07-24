public class Siamese extends Cat {
	public Siamese(String name, int birthYear) {
		super(name, birthYear);
	}

	@Override
	public String noise() {
		double r = Math.random();

		// 50% chance to return meow or prrr each time noise is called.
		if (r < 0.5) {
			return "I am siamese if you please";
		} else {
			return "mememeeow";
		}
	}
}
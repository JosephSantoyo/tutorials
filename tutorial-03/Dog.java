public class Dog extends Animal{
	public Dog(String name, int birthYear) {
		// Use Animal's constructor
		super(name, birthYear);
	}

	@Override
	public String noise() {
		double r = Math.random();

		// 50% chance to return meow or prrr each time noise is called.
		if (r < 0.5) {
			return "woof";
		} else {
			return "grrr";
		}
	}
}
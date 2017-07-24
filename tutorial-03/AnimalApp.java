import java.util.Random;
import java.util.Calendar;

/** COMP 1006/1406 Tutorial Material
    <p>
		Testing program for the Amimal, Cat and Dog classes.
        
	  @version 1.0
	 */

public class AnimalApp{
	/** number of animals in collection */
	public static final int SIZE = 10;

	/** a collection of names for generating random animals */
	public static String[] names = {"Fluffy", "Tiger", "Spot", 
	    "Bubbles", "Dodger", "Ace", "Flower", "Tiny", "Pip"};
	
	
	public static void main(String[] args){
		Random rnd = new Random();
		
		/* get the current year based on computer's clock */
	  	Calendar now = Calendar.getInstance();   
		int year = now.get(Calendar.YEAR);  
		System.out.println("The year is " + year);
		
		/* some animals */
		Animal[] animals = new Animal[SIZE];

		/* randonly pick a cat or dog                */
		/* use random names from the `names` array   */
		/* use random birth years                    */
		for(int i=0; i<SIZE; i+=1){
			double r = Math.random();
			if(r < 0.33){
				//animals[i] = new Cat( names[rnd.nextInt(names.length)], rnd.nextInt(12) + 2000);
				if (r < 0.5) {
					animals[i] = new Tabby( names[rnd.nextInt(names.length)], rnd.nextInt(12) + 2000);
				} else {
					animals[i] = new Siamese( names[rnd.nextInt(names.length)], rnd.nextInt(12) + 2000);
				}
			}else if (r >= 0.33 && r < 0.66) {
				//animals[i] = new Dog( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000);
				if (r < 0.5) {
					animals[i] = new Corgi( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000);
				} else {
					animals[i] = new Chihuahua( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000);
				}
			} else {
				int j = rnd.nextInt(2);
				boolean wise = j > 0? true : false;
				if (r < 0.8) {
					animals[i] = new Tooty( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000, wise );
				} else {
					animals[i] = new Hooty( names[rnd.nextInt(names.length)], rnd.nextInt(14) + 2000, wise );
				}
				
			}
		}
	
		for(Animal animal: animals){
			System.out.print(animal + " ... ");
			System.out.println(animal.noise());
		}
	}


}

import com.cg.beans.Dog;
import com.cg.specs.Pet;

public class Entry3 {

	public static void main(String[] args) {
		Pet petRef = getAPet();

		petRef.beFriendly();
		petRef.play();

		petRef = getAnAnonymousPet();
		petRef.beFriendly();
		petRef.play();
		
		
		
		System.out.println(Pet.MAX);
	}

	public static Pet getAPet() {
		return new Dog();
	}

	public static Pet getAnAnonymousPet() {

		Pet petRef = new Pet() {
			@Override
			public void beFriendly() {
				// TODO Auto-generated method stub
				System.out.println("anonymous pet is friendly");
			}

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("you can play with anonymous pet");
			}

		};

		return petRef;
	}

}

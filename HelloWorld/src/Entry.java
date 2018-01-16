
public class Entry {
	public static void main(String[] args) {
		Person pRef;		// reference variable(const pointer)
		int value;			// primitive variable
		
		value = 90;
		
		pRef = new Person();
		
		Person pRef2 = pRef;
		
		System.out.println(pRef == pRef2);
		
		pRef2 = new Person();
		
		System.out.println(pRef == pRef2);
		
		
	}
}

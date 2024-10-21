package oldshelf;

public class TextBook extends Book {

	// DONE: Make this a final field with most strict visiibility possible. - Done
	private final String subject;
	
	// DONE: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		this.subject=subject;
	}

	// DONE : create a getter if required.
	public String getSubject(){
		return subject;
	}
	// DONE: Create a setter if required
	
	// DONE: write a toString method
	@Override
	public String toString() {
		return "TextBook : "+subject;
	}

}

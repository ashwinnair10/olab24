package oldshelf;

public class TextBook extends Book {

	// DONE: Make this a final field with most strict visiibility possible. - Done
	private final String subject;
	
	// DONE: Change the constructor if required? Correct any errors
	TextBook(String subject) {
		this.subject=subject;
	}

	// DONE : create a getter if required.
	public String subject(){
		return subject;
	}
	// DONE: Create a setter if required
	
	// DONE: write a toString method
	@Override
	public final String toString() {
		return "TextBook: "+subject;
	}
	@Override
	public final int hashCode(){
		return subject.length();
	}
	@Override
	public final boolean equals(Object o){
		if(o instanceof TextBook t){
			if(t.hashCode()==this.hashCode())
			return true;
		}
		return false;
	}
}

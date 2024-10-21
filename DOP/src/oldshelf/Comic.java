package oldshelf;

public class Comic extends Book {

	/* DONE: Add most strict modifiers here*/ 
	private final String Title;

	// DONE: Warning to be removed.
	private final int ageOfMainCharacter;

	// DONE Correct the error
	public Comic(String title,int age) {
		Title=title;
		ageOfMainCharacter=age;
	}
	
	// DONE : create a getter if required.
	public String getTitle(){
		return Title;
	}
	public int getAgeOfMainCharacter(){
		return ageOfMainCharacter;
	}
	// DONE: Create a setter if required

	// DONE: write a toString method
	@Override
	public String toString() {
		return "Comic: "+Title+" Age of Main character: "+ageOfMainCharacter;
	}

	// DONE: Bonus: 
	@Override
	public int hashCode() {
		// DONE: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return (ageOfMainCharacter+Title.length()+69)%100;
	}
	
	// DONE: Bonus: 
	@Override
	public boolean equals(Object o) {
		// DONE: Based on the information about hashCode write the equals method.
		if(o instanceof Comic c){
			if(c.hashCode()==this.hashCode())
			return true;
		}
		return false;
	}
}

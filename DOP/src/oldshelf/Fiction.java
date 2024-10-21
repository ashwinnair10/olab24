package oldshelf;

public class Fiction extends Book {

	/* DONE: Add most strict modifiers here*/ 
	private final String name;
	// DONE: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type;
	public Fiction(String title,FictionType f) {
		//super(title);
		name=title;
		type=f;
		// DONE  correct the above.
	}
	public String getName(){
		return name;
	}
	public FictionType getFictionType(){
		return type;
	}
	@Override
	public String toString(){
		return "Fiction: "+name+" Fiction-Type:"+type;
	}
}

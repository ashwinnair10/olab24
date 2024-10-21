package newshelf;

import oldshelf.FictionType;

public class NewSelection {

	// DONE: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof IBook) {
			if(o instanceof Comic c){
				return c.Title();
			}
			else if(o instanceof Fiction f){
				return f.name();
			}
			else if(o instanceof TextBook t){
				return t.subject();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		// DONE: Write a test code here and execute and text.
		TextBook t = new TextBook("Science");
		Comic c=new Comic("Superman", 32);
		Fiction f=new Fiction("Maze Runner",FictionType.Tragedy);
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(f));
	}
}

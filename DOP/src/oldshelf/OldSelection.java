package oldshelf;

public class OldSelection {

	// DONE: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			if(o instanceof Comic c){
				return c.getTitle();
			}
			else if(o instanceof Fiction f){
				return f.getName();
			}
			else if(o instanceof TextBook t){
				return t.subject();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		// DONE: Write a test code here and execute and text.
		TextBook t = new TextBook("Mathematics");
		Comic c1=new Comic("Adventures of Spider-man", 12);
		Comic c2=new Comic("Batman",30);
		Fiction f=new Fiction("Harry Potter",FictionType.Tragedy);
		System.out.println(t);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(f);
		System.out.println(c1.equals(c2));
	}
}

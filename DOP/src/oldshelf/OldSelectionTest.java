package oldshelf;

import org.junit.Test;
import static org.junit.Assert.*;

public class OldSelectionTest {
    public OldSelectionTest(){}
    @Test
    public void positiveTest() {
        Fiction f=new Fiction("Harry Potter",FictionType.Tragedy);
        assertEquals("Harry Potter",OldSelection.getAgeOrTitle(f));
    }

    @Test
    public void NegativeTest() {
        TextBook t=new TextBook("Mathematics");
        assertEquals("Science",OldSelection.getAgeOrTitle(t));
    }

}

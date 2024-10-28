package bonustask;

import oldshelf.FictionType;

public sealed interface IBook<T> extends Comparable<Object> permits Comic,Fiction,TextBook,TestClass{}

record Comic(String Title,int ageOfMainCharacter) implements IBook<Comic>{
    @Override
    public int compareTo(Object o){
        if(o instanceof Comic c){
            int i=c.Title().compareTo(Title);
            return i!=0?i:c.ageOfMainCharacter()-ageOfMainCharacter;
        }
        return -1;
    }
}
record Fiction(String name,FictionType type) implements IBook<Fiction>{
    @Override
    public int compareTo(Object o) {
        if(o instanceof Fiction f){
            int i=f.name().compareTo(name);
            return i!=0?i:f.type().compareTo(type);
        }
        return -1;
    }
}
record TextBook(String subject) implements IBook<TextBook>{
    @Override
    public int compareTo(Object o) {
        if(o instanceof TextBook t){
            return t.subject().compareTo(subject);
        }
        return -1;
    }
}

record TestClass(String s) implements IBook<TestClass>{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

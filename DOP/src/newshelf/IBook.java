package newshelf;

import oldshelf.FictionType;

public sealed interface IBook permits Comic,Fiction,TextBook,TestClass{}

record Comic(String Title,int ageOfMainCharacter) implements IBook{}
record Fiction(String name,FictionType type) implements IBook{}
record TextBook(String subject) implements IBook {}

record TestClass(String s) implements IBook{}

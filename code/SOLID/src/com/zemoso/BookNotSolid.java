package com.zemoso;

public class BookNotSolid {
    private String nameOfTheBook;
    private String authorName;

    public BookNotSolid(String nameOfTheBook, String authorName) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorName = authorName;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void printBookDetails(){
        System.out.println(nameOfTheBook + " by " + authorName);
    }
}

package com.zemoso;

public class BookSolid {
    private String nameOfTheBook;
    private String authorName;

    public BookSolid(String nameOfTheBook, String authorName) {
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
}

class BookDetailsPrinter{
    public void printBookDetails(BookSolid b){
        System.out.println(b.getNameOfTheBook() + " by " + b.getAuthorName());
    }
}

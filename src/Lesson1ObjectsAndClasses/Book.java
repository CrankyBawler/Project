package Lesson1ObjectsAndClasses;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }
        public int getPublishingYear () {
        return this.publishingYear;
        }
    public void setPublishingYear ( int publishingYear){
        this.publishingYear = publishingYear;
        }
    @Override
    public String toString() {
        return "Название книги " + bookName + " Имя автора " + authorName + " Год публикации " + publishingYear;
    }
    }


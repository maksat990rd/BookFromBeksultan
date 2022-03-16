package com.company.file.books;

import com.company.file.FileInfo;

import java.util.List;

public class Book <T extends BookType>{
    private List<FileInfo> images;
    private String bookName;
    private String bookAuthor;
    private int price;
    private int likes;
    private T book;

    public Book() {}

    public Book(List<FileInfo> images, String bookName, String bookAuthor, int price, int likes, T book) {
        this.images = images;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.likes = likes;
        this.book = book;
    }

    public List<FileInfo> getImages() {
        return images;
    }

    public void setImages(List<FileInfo> images) {
        this.images = images;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.likes--;
    }
    @Override
    public String toString() {
        return "Book{" +
                "images=" + images +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                ", likes=" + likes +
                ", book=" + book +
                '}';
    }
}

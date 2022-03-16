package com.company;

import com.company.AlredyLikedException.AlreadyLikedExc;
import com.company.file.books.Book;
import com.company.file.prodavec.Client;

public class Application {
    public Application() {}
    public void like(Client client, Book<?> book) {
        try {
            if (client.getLikedBooks().contains(book)) {
                throw new AlreadyLikedExc();
            }
            client.likedABook(book);
            book.like();
        } catch (AlreadyLikedExc exception) {
            String message = String.format("client [%s] already liked book [%s]",
                    client.getClientName(),
                    book.getBookName());
            System.err.println(message);
        }
    }

    public void dislike(Client client, Book<?> book) {
        client.dislikedBook(book);
        book.dislike();
    }

    public void buyABook(Client client,
                         Book<?> book) {
        client.buyABook(book);
    }
}
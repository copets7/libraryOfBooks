package dao;

import entiti.Book;

import java.nio.file.Path;

public interface BookDAO {
    void addBook(Book book);
    void dellBook();
    void searchBook(String name);
    void viewAllBook();
}

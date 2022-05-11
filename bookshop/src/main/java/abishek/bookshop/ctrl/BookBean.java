/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package abishek.bookshop.ctrl;

import abishek.bookshop.bus.BookService;
import abishek.bookshop.ent.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "bookBean")
@RequestScoped

public class BookBean {

    @EJB
    private BookService bs;
    private List<Book> allBooks = new ArrayList<>();

    public BookBean() {
    }

    private Book b = new Book();

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }

    public void createBook() {
        bs.createNewBook(b);
    }

    public List<Book> getAllBooks() {
        allBooks = bs.findAllBooks();
        return allBooks;
    }

}

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
    
    public BookBean() {
    }
    
    private String bookName;
    private Book b = new Book();

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }
    

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    
    public void createBook(){
        bs.createNewBook(b);
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package abishek.bookshop.bus;

import abishek.bookshop.ent.Book;
import abishek.bookshop.pers.BookFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Jim Briggs
 */
@Stateless
public class BookService {

    @EJB
    private BookFacade bf;

    public Book createNewBook(Book b) {
        bf.create(b);
        return b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List<Book> findAllBooks() {
        return bf.findAll();
    }

    public void deleteOldBook(Book b) {
        bf.remove(b);    
    }
    
    public Book getBookById(long id){
        return bf.getBookById(id);
    }
    
    public Book editBook(Book b){
        return bf.edit(b);
    }
}

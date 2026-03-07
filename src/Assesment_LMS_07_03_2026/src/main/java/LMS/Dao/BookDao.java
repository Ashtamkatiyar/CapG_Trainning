package LMS.Dao;

import LMS.Entity.Book;
import jakarta.persistence.*;

public class BookDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("my-pu");

    // UPDATE BOOK PRICE

    public void updatePrice(int id,int price){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Book b = em.find(Book.class,id);

        if(b!=null){
            b.setPrice(price);
        }

        em.getTransaction().commit();

    }

    // DELETE BOOK

    public void deleteBook(int id){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Book b = em.find(Book.class,id);

        if(b!=null){
            em.remove(b);
        }
        em.getTransaction().commit();

    }
}
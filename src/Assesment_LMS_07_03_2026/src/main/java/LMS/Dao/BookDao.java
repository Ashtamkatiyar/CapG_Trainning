package LMS.Dao;

import LMS.Entity.Book;
import jakarta.persistence.*;

public class BookDao {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("my-pu");

    // Update Boook Price

    public void updatePrice(int id,int price){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Book b = em.find(Book.class,id);

        if(b!=null){
            b.setPrice(price);
        }

        em.getTransaction().commit();

    }

    // Delete

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
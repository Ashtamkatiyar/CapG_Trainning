package LMS.Dao;

import LMS.Entity.Author;
import LMS.Entity.Book;
import jakarta.persistence.*;

import java.util.List;

public class AuthorDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

    // Insert

    public void insertAuthor(Author author){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(author);

        em.getTransaction().commit();

    }

    // Read

    public void getAllAuthor(){

        EntityManager em = emf.createEntityManager();

        List<Author> authors =
                em.createQuery("from Author",Author.class).getResultList();

        for(Author a:authors){

            System.out.println("Author ID : "+a.getAuthorId());
            System.out.println("Author Name : "+a.getAuthorName());
            System.out.println("Email : "+a.getEmail());

            System.out.println("Books Written:");

            for(Book b:a.getBooks()){
                System.out.println(
                        b.getBookid()+" - "+ b.getTitle()+" - "+ b.getPrice());
            }

            System.out.println("--------------------");
        }


    }

    // Delete

    public void deleteAuthor(int id){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Author a = em.find(Author.class,id);

        if(a!=null){
            em.remove(a);
        }

        em.getTransaction().commit();

    }
}
package LMS.Service;

import LMS.Dao.AuthorDao;
import LMS.Entity.Author;
import LMS.Entity.Book;

import java.util.List;

public class AuthorService {

    AuthorDao authorDao = new AuthorDao();

    public void addAuthor(){

        Author author =
                new Author("James Gosling","james@gmail.com");

        Book b1 = new Book("Java Fundamentals",450);
        Book b2 = new Book("Advanced Java",650);
        Book b3 = new Book("Java Streams",550);

        b1.setAuthor(author);
        b2.setAuthor(author);
        b3.setAuthor(author);

        author.setBooks(List.of(b1,b2,b3));

        authorDao.insertAuthor(author);
    }

    public void showAuthors(){
        authorDao.getAllAuthor();
    }

    public void deleteAuthor(int id){
        authorDao.deleteAuthor(id);
    }
}
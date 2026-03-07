package LMS.Service;

import LMS.Dao.AuthorDao;
import LMS.Entity.Author;
import LMS.Entity.Book;

import java.util.List;

public class AuthorService {

    AuthorDao authorDao = new AuthorDao();

    public void addAuthor(){

        Author author = new Author("Katiyar","katiyar@gmail.com");

        Book b1 = new Book("Programming",450);
        Book b2 = new Book("SQL",650);
        Book b3 = new Book("Streams",550);

        b1.setAuthor(author);
        b2.setAuthor(author);
        b3.setAuthor(author);

        author.setBooks(List.of(b1,b2,b3));

        authorDao.insertAuthor(author);

        Author author2 = new Author("Ashtam ","Ashtam@gmail.com");

        Book b4 = new Book("Java",800);
        Book b5 = new Book("dsa",600);
        Book b6 = new Book("Spring ",520);

        b4.setAuthor(author2);
        b5.setAuthor(author2);
        b6.setAuthor(author2);

        author.setBooks(List.of(b4,b5,b6));

        authorDao.insertAuthor(author2);
    }

    public void showAuthors(){
        authorDao.getAllAuthor();
    }

    public void deleteAuthor(int id){
        authorDao.deleteAuthor(id);
    }
}
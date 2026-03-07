package LMS.Main;

import LMS.Service.AuthorService;
import LMS.Service.BookService;

public class Main {

    public static void main(String[] args) {

        AuthorService as = new AuthorService();
        BookService bs = new BookService();

        // INSERT
        as.addAuthor();

        // READ
        as.showAuthors();

        // UPDATE
        bs.updateBookPrice(1,800);

        // DELETE BOOK
        bs.deleteBook(2);

        // DELETE AUTHOR
        as.deleteAuthor(1);
    }
}
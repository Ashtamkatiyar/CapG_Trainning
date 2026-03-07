package LMS.Service;

import LMS.Dao.BookDao;

public class BookService {

    BookDao bookDao = new BookDao();

    public void updateBookPrice(int id,int price){
        bookDao.updatePrice(id,price);
    }

    public void deleteBook(int id){
        bookDao.deleteBook(id);
    }
}
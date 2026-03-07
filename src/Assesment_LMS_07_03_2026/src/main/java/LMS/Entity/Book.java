package LMS.Entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookid;

    private String title;
    private int price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {}

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
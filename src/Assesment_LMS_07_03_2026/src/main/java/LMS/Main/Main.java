package LMS.Main;

import LMS.Service.AuthorService;
import LMS.Service.BookService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AuthorService as = new AuthorService();
        BookService bs = new BookService();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("LMS");
            System.out.println("1. Add Author");
            System.out.println("2. Show Authors");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete Book");
            System.out.println("5. Delete Author");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    as.addAuthor();
                    break;

                case 2:
                    as.showAuthors();
                    break;

                case 3:
                    System.out.print("Enter Book Id: ");
                    int bid = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    int price = sc.nextInt();

                    bs.updateBookPrice(bid, price);
                    break;

                case 4:
                    System.out.print("Enter Book Id to delete: ");
                    int bookId = sc.nextInt();
                    bs.deleteBook(bookId);
                    break;

                case 5:
                    System.out.print("Enter Author Id to delete: ");
                    int authorId = sc.nextInt();
                    as.deleteAuthor(authorId);
                    break;

                case 6:
                    System.out.println("Exit");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
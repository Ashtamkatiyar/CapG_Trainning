package Day1Assignment;

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        GameService service = new GameService();

        while (true) {

            System.out.println("\n--- Main Menu ---");
            System.out.println("1) RegisterUser");
            System.out.println("2) ViewGames");
            System.out.println("3) searchByName");
            System.out.println("4) Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter UserId: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String nm = sc.nextLine();
                    user.adduser(uid, nm);
                    break;

                case 2:
                    System.out.println("--Please Authenticate first :");
                    System.out.println("Enter Your id ");
                    String id=sc.nextLine();
                    System.out.println("Enter Your Name ");
                    String m=sc.nextLine();
                   if(user.IsAuthenticated(id,m)) {
                       List<Game> gameList = service.viewAll();
                       gameList.forEach(System.out::println);
                   }
                   else{
                       System.out.println("NOt Authenticated");
                   }
                   break;
                case 3:
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    String result = service.authorSearch(author);
                    System.out.println(result);
                    break;

                case 4:
                    System.out.println("closing Application");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
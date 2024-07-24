import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();


        while (true) {
            System.out.print("Enter the title of the book (or press Enter to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the publication year: ");
            int pubYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            books.add(new Book(title, numPages, pubYear));
        }

        System.out.print("What do you want to print? (everything/name): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}

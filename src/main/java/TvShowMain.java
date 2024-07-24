import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TvShow> tvShows = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the TV show (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int numEpisodes = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(name, numEpisodes, genre));
        }

        System.out.println("List of TV shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        scanner.close();
    }
}

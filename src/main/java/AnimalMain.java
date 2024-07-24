import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Enter the name of your animal (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (yes/no): ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        System.out.println("List of animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}

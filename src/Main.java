import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate the cost of one package");
        System.out.println("2. Simulate packages");
        System.out.println("3. How packages are calculated");
        System.out.println("4. Exit");
        System.out.print("Input: ");
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            System.out.print("Enter the zip code of the origin package: ");
            int zipCode1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the zip code of the destination package: ");
            int zipCode2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the weight of the package: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the height of the package: ");
            double height = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the length of the package: ");
            double length = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the width of the package: ");
            double width = scanner.nextDouble();
            scanner.nextLine();
            PostageCalculator box = new PostageCalculator();
            System.out.println("Cost: " + box.calculatePostage(zipCode1, zipCode2, weight));
        } else if (choice.equals("2")) {

        } else if (choice.equals("3")) {

        } else {
            System.exit(0);
        }
    }
}
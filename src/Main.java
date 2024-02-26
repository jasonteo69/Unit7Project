import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("4")) {
            System.out.println("------------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. Calculate the cost of one package");
            System.out.println("2. Simulate packages");
            System.out.println("3. How packages are calculated");
            System.out.println("4. Exit");
            System.out.print("Input: ");
            choice = scanner.nextLine();

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
                System.out.println("Cost: " + box.calculatePostage(zipCode1, zipCode2, weight, height, length, width));

            } else if (choice.equals("2")) {

                PackageSimulator simulation = new PackageSimulator();
                System.out.print("How many packages would you like to simulate? ");
                int numOfPackagesToBeGenerated = scanner.nextInt();
                scanner.nextLine();
                simulation.generatePackages(4);
                System.out.println("Randomly generated package info: ");
                System.out.println(simulation.getSimulationInfo());

            } else if (choice.equals("3")) {

                System.out.println("How packages are being calculated: ");
                System.out.println("------------------------------");
                System.out.println("Each packages' base cost is $3.75");
                System.out.println("For each tenth of a pound, 5 cents are added onto the packages' price");
                System.out.println("The total price can be evaluated when the difference in county codes are divided by 100 and added on to the package price");
                System.out.println("For oversize packages (dimensions total more than 36 inches; weigh over 40 pounds): ");
                System.out.println("Ten cents are added for each inch over, or every tenth of a pound over");
                System.out.println();

            }
        }
        System.exit(0);
    }
}
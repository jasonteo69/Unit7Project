import java.util.ArrayList;

public class PackageSimulator {
    private ArrayList<Package> packages;
    private double cost;
    private PostageCalculator calculator;
    public PackageSimulator() {
        packages = new ArrayList<Package>();
        calculator = new PostageCalculator();
    }
    public void generatePackages(int numToGenerate) {
        for (int i = 0; i < numToGenerate; i++) {
            double randHeight = (Math.random() * 14) + 2;
            double randWeight = (Math.random() * 71) + 0.1;
            double randLength = (Math.random() * 21) + 2;
            double randWidth = (Math.random() * 16) + 2;
            int randZip = (int) (Math.random() * 99449) + 501;
            int randZip2 = (int) (Math.random() * 99449) + 501;
            Address addy = new Address("123", "Random Street", "Apt 3C", "City", "State", randZip);
            Address addy2 = new Address("123", "Random Street", "Apt 3C", "City", "State", randZip2);
            Package generatedPackage = new Package(addy, addy2, randWeight, randHeight, randLength, randWidth);
            packages.add(generatedPackage);
            cost += calculator.calculatePostage(generatedPackage);
        }
    }
    public double generateTotalCost() {
        return cost;
    }
    public String getSimulationInfo() {
        String simInfo = "";
        for (int i = 0; i < packages.size(); i++) {
            int packageNum = i + 1;
            simInfo += "Package " + packageNum + ": ------------------------------\n";
            simInfo += "Origin address " + packages.get(i).getOrigin().toString() + "\n";
            simInfo += "Destination address: " + packages.get(i).getDestination().toString() + "\n";
            simInfo += "Weight: " + packages.get(i).getWeight() + "\n";
            simInfo += "Height: " + packages.get(i).getHeight() + "\n";
            simInfo += "Length: " + packages.get(i).getLength() + "\n";
            simInfo += "Width: " + packages.get(i).getWidth() + "\n";
            simInfo += "Cost: " + calculator.calculatePostage(packages.get(i)) + "\n";
        }
        return simInfo;
    }
    public void resetSimulation() {
        packages.clear();
    }
}

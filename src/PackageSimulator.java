import java.util.ArrayList;

public class PackageSimulator {
    private ArrayList<Package> packages;
    private double cost;
    public PackageSimulator() {
        packages = null;
    }
    public void generatePackages(int numToGenerate) {
        for (int i = 0; i < numToGenerate; i++) {
            double randHeight = (Math.random() * 16);
            double randWeight = (Math.random() * 71);
            double randLength = (Math.random() * 23);
            double randWidth = (Math.random() * 18);
            int randZip = (int) (Math.random() * 9449) + 501;
            int randZip2 = (int) (Math.random() * 9449) + 501;
            Address addy = new Address("123", "Random Street", "Apt 3C", "Random City", "Random State", randZip);
            Address addy2 = new Address("123", "Random Street", "Apt 3C", "Random City", "Random State", randZip2);
            Package generatedPackage = new Package(addy, addy2, randWeight, randHeight, randLength, randWidth);
            packages.add(generatedPackage);
        }
    }
    public double generateTotalCost() {
        return cost;
    }
    public String getSimulationInfo() {
        String simInfo = "";
        return String.valueOf(packages);
    }
    public void resetSimulation() {
        packages = null;
    }
}

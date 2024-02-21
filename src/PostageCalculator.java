public class PostageCalculator {
    private final double baseCost;
    double costOfShipping;
    public PostageCalculator() {
        baseCost = 3.75;
    }
    public double calculatePostage(int zipCode1, int zipCode2, double weight) {
        costOfShipping = baseCost;
        int countyCode1 = zipCode1 / 100;
        int countyCode2 = zipCode2 / 100;
        int count = 0;
        for (double i = weight; i >= 0; i -= 0.1) {
            count++;
        }
        for (int j = 0; j < count; j++) {
            costOfShipping += 0.05;
        }
        double difference = (countyCode1 - countyCode2) / 100.00;
        costOfShipping += difference;
        return Math.round(costOfShipping * 100.0) / 100.0;
    }
    public double calculatePostage(Address address1, Address address2, double weight, double height, double length, double width) {
        costOfShipping = baseCost;
        int countyCode1 = address1.getZipCode() / 100;
        int countyCode2 = address2.getZipCode() / 100;
        double extraCharge = 0.0;
        if (weight > 40) {
            int count = 0;
            extraCharge = weight - 40;
            for (double i = extraCharge; i >= 0; i -= 0.1) {
                count++;
            }
            for (int j = 0; j < count; j++) {
                costOfShipping += 0.1;
            }
        }
        double difference = (countyCode1 - countyCode2) / 100.00;
        costOfShipping += difference;
        return Math.round(costOfShipping * 100.0) / 100.0;
    }
    public double calculatePostage(Package pack) {
        double test = calculatePostage(pack.getDestination(), pack.getOrigin(), pack.getWeight(), pack.getHeight(), pack.getLength(), pack.getWidth());
        return test;
    }
}

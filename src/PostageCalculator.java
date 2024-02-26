public class PostageCalculator {
    private final double baseCost;
    double costOfShipping;
    public PostageCalculator() {
        baseCost = 3.75;
    }
    public double calculatePostage(int zipCode1, int zipCode2, double weight, double height, double length, double width) {
        costOfShipping = baseCost;
        int countyCode1 = zipCode1 / 100;
        int countyCode2 = zipCode2 / 100;
        int count = 0;
        //over 40 charge
        if (weight > 40) {
            for (double i = 0; i <= 40; i += 0.1) {
                costOfShipping += 0.05;
            }
            for (double i = 40; i <= weight; i += 0.1) {
                costOfShipping += 0.1;
            }
        } else {
            for (double i = weight; i >= 0; i -= 0.1) {
                count++;
            }
            for (int j = 0; j < count; j++) {
                costOfShipping += 0.05;
            }
        }
        double limit = height + length + width;
        if (limit > 36) {
            for (int i = 36; i < limit; i++) {
                costOfShipping += 0.1;
            }
        }
        double difference = (countyCode1 - countyCode2) / 100.00;
        costOfShipping += difference;
        return Math.round(costOfShipping * 100.0) / 100.0;
    }
    public double calculatePostage(Address address1, Address address2, double weight, double height, double length, double width) {
        costOfShipping = baseCost;
        costOfShipping = calculatePostage(address1.getZipCode(), address2.getZipCode(), weight, height, length, width);
        return costOfShipping;
    }
    public double calculatePostage(Package pack) {
        costOfShipping = calculatePostage(pack.getDestination(), pack.getOrigin(), pack.getWeight(), pack.getHeight(), pack.getLength(), pack.getWidth());
        return Math.round(costOfShipping * 100.0) / 100.0;
    }
}

import java.util.Arrays;
public class Address {
    private String houseNumber;
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private int zipCode;
    public Address(String houseNum, String street, String aptNum, String city, String state, int zipCode) {
        houseNumber = houseNum;
        streetName = street;
        apartmentNumber = aptNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address address) {
        zipCode = address.zipCode;
        state = address.state;
        city = address.city;
        apartmentNumber = address.apartmentNumber;
        streetName = address.streetName;
        houseNumber = address.houseNumber;
    }
    public Address(String str) {
        String[] addressString = str.split(" ");
        houseNumber = addressString[0];
        streetName = addressString[1];
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return houseNumber + " " + streetName + " " + apartmentNumber + ", " + city + ", " + state + " " + zipCode;
    }
}

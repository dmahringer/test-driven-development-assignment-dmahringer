package at.ac.htl.bhitm3.model;

public class Address {

    private String street;
    private int houseNumber;
    private int plz;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setPLZ(int plz) {
        this.plz = plz;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getStreet() {
        return this.street;
    }

    public Object getHouseNumber() {
        return this.houseNumber;
    }

    public Object getPLZ() {
        return this.plz;
    }

    public Object getCity() {
        return this.city;
    }
}

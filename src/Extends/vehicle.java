package Extends;

public class vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    public vehicle (String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        }
    public vehicle () {
        super();}



    // Getters and setters for class attributes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nPrice: $" + price;
}

}

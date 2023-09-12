package Extends;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    // Method to add a Vehicle to the garage
    public void addVehicle(vehicle vehicle) {
        vehicles.add(vehicle);
    }
    //Method to remove a Vehicle by its ID
    public void removeVehicle( int id){
        vehicles.remove(id);

    }
    public float calculateBill() {
        float totalBill = 0;
        for (vehicle v : vehicles) {
            if (v.getClass() == Car.class) {
                totalBill += 100;
            } else if (v.getClass() == motorbike.class) {
                totalBill += 20;
            } else if (v.getClass() == plane.class) {
                totalBill += 500;
            } else return totalBill;

        }
        return totalBill;

    }

    // Method to print the garage
    public void printGarage() {
        if (vehicles.isEmpty()) {
            System.out.println("The garage is empty.");
        } else {
            System.out.println("Vehicles in the garage:");
            for (vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    // Method to empty the garage
    public void emptyGarage() {
        vehicles.clear();
        System.out.println("The garage has been emptied.");
    }
}


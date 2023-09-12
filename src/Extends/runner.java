package Extends;

public class runner {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.0);

        // Creating a Motorbike object
        motorbike myMotorbike = new motorbike("Harley-Davidson", "Sportster", 2021, 12000.0);

        // Creating a Plane object
        plane myPlane = new plane("Boeing", "747", 2019, 150000000.0);

        // Printing the details of each vehicle
        System.out.println("Car Details:\n" + myCar);
        System.out.println("\nMotorbike Details:\n" + myMotorbike);
        System.out.println("\nPlane Details:\n" + myPlane);

        // Creating a Garage
        Garage myGarage = new Garage();

        // Adding vehicles to the garage
        myGarage.addVehicle(myCar);
        myGarage.addVehicle(myMotorbike);
        myGarage.addVehicle(myPlane);

        // Printing the garage
        System.out.println("Garage contents:");
        myGarage.printGarage();

        // Printing the updated garage
        System.out.println("\nGarage after removing a vehicle:");
        myGarage.printGarage();

        // Emptying the garage
        //myGarage.emptyGarage();

        // Printing the garage after emptying it
        System.out.println("\nGarage after emptying:");
        myGarage.printGarage();

        //calculate the total bill
        System.out.println(myGarage.calculateBill());








    }
}


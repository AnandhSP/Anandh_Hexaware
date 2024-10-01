package com.hexaware.mainvehicleprogram;
import java.util.ArrayList;
import java.util.Scanner;

import com.hexaware.abstractclasses.Vehicle;
import com.hexaware.interfaceclass.User;
import com.hexaware.concreteclasses.Bike;
import com.hexaware.concreteclasses.Car;
import com.hexaware.concreteclasses.Truck;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Rolls Royce", 50));
        vehicles.add(new Bike("Audi", 20));
        vehicles.add(new Truck("Benz", 100));

        User user = new User("Anandh");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. View Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Vehicles:");
                    for (Vehicle v : vehicles) {
                        if (!v.isrented()) {
                            System.out.println(v.getname() + " - Rs" + v.getrentalprice());
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of the vehicle to rent: ");
                    scanner.nextLine();  // Consume newline
                    String vehicleToRent = scanner.nextLine();
                    for (Vehicle v : vehicles) {
                        if (v.getname().equalsIgnoreCase(vehicleToRent) && !v.isrented()) {
                            user.rentVehicle(v);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the vehicle to return: ");
                    scanner.nextLine(); 
                    String vehicleToReturn = scanner.nextLine();
                    for (Vehicle v : vehicles) {
                        if (v.getname().equalsIgnoreCase(vehicleToReturn) && v.isrented()) {
                            user.returnVehicle(v);
                            break;
                        }
                    }
                    break;

                case 4:
                    user.viewRentedVehicles();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        scanner.close();
    }
}

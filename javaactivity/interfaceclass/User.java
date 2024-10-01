package com.hexaware.interfaceclass;
import java.util.ArrayList;

import com.hexaware.abstractclasses.Vehicle;

public class User {
    private String username;
    private ArrayList<Vehicle> rentedVehicles;

    public User(String username) {
        this.username = username;
        this.rentedVehicles = new ArrayList<>();
    }


    public void rentVehicle(Vehicle vehicle) {
        if (!vehicle.isrented()) {
            vehicle.rentVehicle();
            rentedVehicles.add(vehicle);
        } else {
            System.out.println("Sorry, " + vehicle.getname() + " is already rented.");
        }
    }


    public void returnVehicle(Vehicle vehicle) {
        if (rentedVehicles.contains(vehicle)) {
            vehicle.returnVehicle();
            rentedVehicles.remove(vehicle);
        } else {
            System.out.println("You haven't rented " + vehicle.getname() + ".");
        }
    }


    public void viewRentedVehicles() {
        if (rentedVehicles.isEmpty()) {
            System.out.println("You haven't rented any vehicles.");
        } else {
            System.out.println("Rented Vehicles:");
            for (Vehicle v : rentedVehicles) {
                System.out.println(v.getname() + " - $" + v.getrentalprice());
            }
        }
    }
}

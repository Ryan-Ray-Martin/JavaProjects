package edu.neu.ccs.cs5004.assignment4.Problem1;

/**
 * An interface of a parking spot, with methods to get the vehicle's size,
 * to remove the vehicle, and to assign the vehicle.
 */
public interface IParkingSpot {

  boolean assignVehicle(AbstractVehicle vehicle);

}

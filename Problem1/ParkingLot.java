package edu.neu.ccs.cs5004.assignment4.Problem1;

import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.DISABLED;
import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.LARGE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.MEDIUM;
import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.SMALL;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.DISABLEDVEHICLE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.LARGEVEHICLE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.MEDIUMVEHICLE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.SMALLVEHICLE;


/**
 * A concrete class of a parking lot which contains the park vehicle method that
 * puts the program together.
 */
class ParkingLot {


  /**
   * A constructor of a parking lot that takes no parameters.
   */
  ParkingLot() {

  }

  /**
   * @param vehicle
   * @param parkingSpot
   * @return a boolean that indicates that the vehicle has parked in the assigned parking spot.
   * @throws UnavailableSpotException
   */
  public boolean parkVehicle(AbstractVehicle vehicle, AbstractParkingSpot parkingSpot)
      throws UnavailableSpotException {

    if (DISABLED.equals(parkingSpot.getSize()) && parkingSpot.free && vehicle.getSize() ==
        DISABLEDVEHICLE) {
      parkingSpot.assignVehicle(vehicle);
      return true;
   } else if (SMALL.equals(parkingSpot.getSize()) && parkingSpot.free && vehicle.getSize() ==
        SMALLVEHICLE) {
      parkingSpot.assignVehicle(vehicle);
      return true;
    }else if (MEDIUM.equals(parkingSpot.getSize()) && parkingSpot.free && vehicle.getSize() ==
        MEDIUMVEHICLE || vehicle.getSize() == SMALLVEHICLE) {
      parkingSpot.assignVehicle(vehicle);
      return true;
    }else if (LARGE.equals(parkingSpot.getSize()) && parkingSpot.free && (((vehicle.getSize() ==
        LARGEVEHICLE )|| vehicle.getSize() == MEDIUMVEHICLE )|| vehicle.getSize() == SMALLVEHICLE)) {
      parkingSpot.assignVehicle(vehicle);
      return true;
    }
    throw new UnavailableSpotException();
  }
}








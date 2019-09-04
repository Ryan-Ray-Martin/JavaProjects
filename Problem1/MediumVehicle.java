package edu.neu.ccs.cs5004.assignment4.Problem1;

import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.MEDIUMVEHICLE;

/**
 * An concrete class of an medium vehicle that contains the function to
 * return the vehicle size, which helps in organizing the entire parking lot
 * (see parking lot class).
 */

public class MediumVehicle extends AbstractVehicle {

  public final VehicleSize size = MEDIUMVEHICLE;

  /** A constructor of the medium parking spot, which contains the size of the
   * parking spot.
   * @param size
   */

  public MediumVehicle(VehicleSize size) {
    super(size);
  }


  /** A method that returns the vehicle size.
   * @return the size of the vehicle.
   */

  @Override
  public VehicleSize getSize() {
    return super.getSize();
  }
}

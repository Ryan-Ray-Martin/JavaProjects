package edu.neu.ccs.cs5004.assignment4.Problem1;

import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.SMALLVEHICLE;

public class SmallVehicle extends AbstractVehicle{

  /**
   * An concrete class of an small vehicle that contains the function to
   * return the vehicle size, which helps in organizing the entire parking lot
   * (see parking lot class).
   */

  public final VehicleSize size = SMALLVEHICLE;

  /** A constructor of the small parking spot, which contains the size of the
   * parking spot.
   * @param size
   */

  SmallVehicle(VehicleSize size) {
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


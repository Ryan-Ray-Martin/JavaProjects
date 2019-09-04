package edu.neu.ccs.cs5004.assignment4.Problem1;

import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.DISABLED;
import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.LARGE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.MEDIUM;
import static edu.neu.ccs.cs5004.assignment4.Problem1.ParkingSlotSize.SMALL;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.DISABLEDVEHICLE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.LARGEVEHICLE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.MEDIUMVEHICLE;
import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.SMALLVEHICLE;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParkingLotTest {


  private DisabledVehicle disabledVehicle;
  private SmallVehicle smallVehicle;
  private MediumVehicle mediumVehicle;
  private LargeVehicle largeVehicle;
  private DisabledSpot disabledSpot;
  private ParkingLot parkingLot;
  private SmallSpot smallSpot;
  private MediumSpot mediumSpot;
  private LargeSpot largeSpot;
  private LargeSpot largeSpot2;


  @Before
  public void setUp() throws Exception {
    this.disabledVehicle = new DisabledVehicle(DISABLEDVEHICLE);
    this.disabledSpot = new DisabledSpot(DISABLED);
    this.smallVehicle = new SmallVehicle(SMALLVEHICLE);
    this.mediumVehicle = new MediumVehicle(MEDIUMVEHICLE);
    this.largeVehicle = new LargeVehicle(LARGEVEHICLE);
    this.smallSpot = new SmallSpot(SMALL);
    this.mediumSpot = new MediumSpot(MEDIUM);
    this.largeSpot = new LargeSpot(LARGE);
    this.largeSpot2 = new LargeSpot(LARGE);
    this.parkingLot = new ParkingLot();
  }

  @Test
  public void parkVehicle() throws UnavailableSpotException {
    Assert.assertEquals(true, parkingLot.parkVehicle(this.disabledVehicle, this.disabledSpot));
    Assert.assertEquals(true, parkingLot.parkVehicle(this.smallVehicle, this.smallSpot));
    Assert.assertEquals(true, parkingLot.parkVehicle(this.mediumVehicle, this.mediumSpot));
    Assert.assertEquals(true, parkingLot.parkVehicle(this.smallVehicle, this.mediumSpot));
    Assert.assertEquals(true, parkingLot.parkVehicle(this.mediumVehicle, this.largeSpot));
    Assert.assertEquals(true, parkingLot.parkVehicle(this.largeVehicle, this.largeSpot2));
    Assert.assertEquals(true, parkingLot.parkVehicle(this.smallVehicle, this.largeSpot));
  }

  @Rule
  public  ExpectedException thrown = ExpectedException.none();

  @Test
  public  void TestForException() throws UnavailableSpotException {
    thrown.expect(UnavailableSpotException.class);
    parkingLot.parkVehicle(this.largeVehicle, this.smallSpot);
    parkingLot.parkVehicle(this.largeVehicle, this.mediumSpot);
    parkingLot.parkVehicle(this.largeVehicle, this.disabledSpot);
    parkingLot.parkVehicle(this.mediumVehicle, this.smallSpot);
    parkingLot.parkVehicle(this.mediumVehicle, this.disabledSpot);
    parkingLot.parkVehicle(this.smallVehicle, this.disabledSpot);
  }


  }


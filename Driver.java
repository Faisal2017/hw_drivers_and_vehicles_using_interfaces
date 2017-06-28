import behaviours.*;

public class Driver {

  private String name;
  private int age;
  private Driveable vehicle;

  public Driver(String name, int age, Driveable vehicle) {
    this.name = name;
    this.age = age;
    this.vehicle = vehicle;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public Driveable getVehicle() {
    return this.vehicle;
  }

  public int driveDistance(int distance) {
    return this.vehicle.driveDistance(distance);
  }

  public String getDrive() {
    return this.vehicle.getDrive();
  }

  public void setVehicle(Driveable vehicle) {
    this.vehicle = vehicle;
  }

}
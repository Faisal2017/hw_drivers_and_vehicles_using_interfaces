import behaviours.*;

public class AstonMartin implements Driveable {

  private String drive;
  private String colour;
  private int speed;

  public AstonMartin(String drive, String colour, int speed) {
    this.drive = drive;
    this.colour = colour;
    this.speed = speed;
  }

  public String getDrive() {
    return this.drive;
  }

  public String getColour() {
    return this.colour;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int driveDistance(int distance) {
    int time = distance / speed;
    return time;
  }


}
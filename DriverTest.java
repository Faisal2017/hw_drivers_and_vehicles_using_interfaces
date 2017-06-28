import static org.junit.Assert.*;
import org.junit.*;

public class DriverTest {

  private Driver driver;
  private AstonMartin astonmartin;

  @Before
  public void before() {
    astonmartin = new AstonMartin("aston martin noise", "green", 183);
    driver = new Driver("sven", 35, astonmartin);
  }

  @Test
  public void hasName() {
    assertEquals("sven", driver.getName());
  }

  @Test
  public void hasAge() {
    assertEquals(35, driver.getAge());
  }

  @Test
  public void hasAstonMartin() {
    AstonMartin vehicle = (AstonMartin) driver.getVehicle(); //casting back method
    assertEquals("aston martin noise", vehicle.getDrive());
  }

  @Test
  public void testCanCallDriveDistanceMethod() {
    int distance = 2000;
    int timeTaken = driver.driveDistance(distance);
    assertEquals(10, timeTaken);
  }

  @Test
  public void canDriveFerrari() {
    Ferrari ferrari = new Ferrari("ferrari noise", "blue", 230);
    driver = new Driver("sven", 35, ferrari);
    assertEquals("ferrari noise", driver.getDrive());
  }

  @Test 
  public void canSetVehicle() {
    Ferrari ferrari = new Ferrari("ferrari noise", "blue", 230);
    driver.setVehicle(ferrari);
    assertEquals("ferrari noise", driver.getDrive());
  }


}
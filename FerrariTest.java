import static org.junit.Assert.*;
import org.junit.*;

public class FerrariTest {

  Ferrari ferrari;

  @Before
  public void before() {
    ferrari = new Ferrari("ferrari noise", "blue", 230);
  }

  @Test
  public void hasDrive() {
    assertEquals("ferrari noise", ferrari.getDrive());
  }
  
  @Test
  public void hasColour() {
    assertEquals("blue", ferrari.getColour());
  }

  @Test
  public void hasSpeed() {
    assertEquals(230, ferrari.getSpeed());
  }

  @Test
  public void testTimeToDriveDistance() {
    assertEquals(8, ferrari.driveDistance(2000));
  }
}
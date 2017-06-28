import static org.junit.Assert.*;
import org.junit.*;

public class AstonMartinTest {

  AstonMartin astonmartin;

@Before
public void before() {
  astonmartin = new AstonMartin("aston martin noise", "green", 183);
}

@Test
public void hasDrive() {
  assertEquals("aston martin noise", astonmartin.getDrive());
}

@Test
public void hasColour() {
  assertEquals("green", astonmartin.getColour());
}

@Test 
public void hasSpeed() {
  assertEquals(183, astonmartin.getSpeed());
}

@Test
public void testForTimeTakenToDriveDistance() {
  int distance = 2000;
  assertEquals(10, astonmartin.driveDistance(distance));
}

}
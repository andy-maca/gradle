import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest
{
  @Test
  public void testSum() {
    Calculate c = new Calculate();
    assertEquals(c.sum(1,2), 3);
  }
}

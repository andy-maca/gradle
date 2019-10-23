import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetMySelfTest
{
  @Test
  public void testGet() {
    GetMySelf g = new GetMySelf();
    assertEquals(g.get("I"), "I");
  }
}

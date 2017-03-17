import org.junit.*;
import static org.junit.Assert.*;


public class PartyTest {

  @Test
  public void newParty_PriceWithNoGuestsAndNoOtherFeatures_0(){
    Party testParty = new Party();
    Integer resultExpected = 0;
    assertEquals(resultExpected, testParty.partyPrice(0,0,0,0, ""));
  }
}

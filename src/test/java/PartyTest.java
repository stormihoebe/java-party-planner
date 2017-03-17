import org.junit.*;
import static org.junit.Assert.*;


public class PartyTest {

  @Test
  public void newParty_PriceWithNoGuestsAndNoOtherFeatures_0(){
    Party testParty = new Party();
    Integer resultExpected = 0;
    assertEquals(resultExpected, testParty.partyPrice(0,0,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndNoOtherFeatures_6(){
    Party testParty = new Party();
    Integer resultExpected = 6;
    assertEquals(resultExpected, testParty.partyPrice(2,0,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacks_10(){
    Party testParty = new Party();
    Integer resultExpected = 10;
    assertEquals(resultExpected, testParty.partyPrice(2,1,0,0, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndPizza_14(){
    Party testParty = new Party();
    Integer resultExpected = 14;
    assertEquals(resultExpected, testParty.partyPrice(2,3,0,0, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndMeal_36(){
    Party testParty = new Party();
    Integer resultExpected = 36;
    assertEquals(resultExpected, testParty.partyPrice(2,4,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndMealAndBar_36(){
    Party testParty = new Party();
    Integer resultExpected = 36;
    assertEquals(resultExpected, testParty.partyPrice(2,4,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBar_30(){
    Party testParty = new Party();
    Integer resultExpected = 30;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,0, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndTeaCoffee_30(){
    Party testParty = new Party();
    Integer resultExpected = 12;
    assertEquals(resultExpected, testParty.partyPrice(2,1,1,0, ""));
  }
}

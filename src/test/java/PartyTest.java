import org.junit.*;
import static org.junit.Assert.*;


public class PartyTest {

  @Test
  public void newParty_PriceWithNoGuestsAndNoOtherFeatures_0(){
    Party testParty = new Party(0,0,0,0, "");
    Integer resultExpected = 0;
    assertEquals(resultExpected, testParty.partyPrice(0,0,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndNoOtherFeatures_6(){
    Party testParty = new Party(2,0,0,0, "");
    Integer resultExpected = 6;
    assertEquals(resultExpected, testParty.partyPrice(2,0,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacks_10(){
    Party testParty = new Party(2,1,0,0, "");
    Integer resultExpected = 10;
    assertEquals(resultExpected, testParty.partyPrice(2,1,0,0, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndPizza_14(){
    Party testParty = new Party(2,3,0,0, "");
    Integer resultExpected = 14;
    assertEquals(resultExpected, testParty.partyPrice(2,3,0,0, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndMeal_36(){
    Party testParty = new Party(2,4,0,0, "");
    Integer resultExpected = 36;
    assertEquals(resultExpected, testParty.partyPrice(2,4,0,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndMealAndBar_56(){
    Party testParty = new Party(2,4,3,0, "");
    Integer resultExpected = 56;
    assertEquals(resultExpected, testParty.partyPrice(2,4,3,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBar_30(){
    Party testParty = new Party(2,1,3,0, "");
    Integer resultExpected = 30;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,0, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndTeaCoffee_30(){
    Party testParty = new Party(2,1,1,0, "");
    Integer resultExpected = 12;
    assertEquals(resultExpected, testParty.partyPrice(2,1,1,0, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndMagician_90(){
    Party testParty = new Party(2,1,3,3, "");
    Integer resultExpected = 90;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,3, ""));
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndClowns_60(){
    Party testParty = new Party(2,1,3,2, "");
    Integer resultExpected = 60;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,2, ""));
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndClownsAnd20OffCoupon_48(){
    Party testParty = new Party(2,1,3,2, "SUPERDEAL20");
    Integer resultExpected = 48;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,2, "SUPERDEAL20"));
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndMagicianAndFreeMagicianCoupon_30(){
    Party testParty = new Party(2,1,3,3, "MAGICALMAYHEM");
    Integer resultExpected = 30;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,3, "MAGICALMAYHEM"));
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndMagicianAndDJCoupon_90(){
    Party testParty = new Party(2,1,3,3, "DJDISCOUNT30");
    Integer resultExpected = 90;
    assertEquals(resultExpected, testParty.partyPrice(2,1,3,3, "DJDISCOUNT30"));
  }

}

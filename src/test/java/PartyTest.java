import org.junit.*;
import static org.junit.Assert.*;


public class PartyTest {

  @Test
  public void newParty_PriceWithNoGuestsAndNoOtherFeatures_0(){
    Party testParty = new Party(0,0,0,0, "");
    double resultExpected = 0;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

  @Test
  public void newParty_PriceWith2GuestsAndNoOtherFeatures_6(){
    Party testParty = new Party(2,0,0,0, "");
    double resultExpected = 6;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacks_10(){
    Party testParty = new Party(2,1,0,0, "");
    double resultExpected = 10;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }
  @Test
  public void newParty_PriceWith2GuestsAndPizza_14(){
    Party testParty = new Party(2,3,0,0, "");
    double resultExpected = 14;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }
  @Test
  public void newParty_PriceWith2GuestsAndMeal_36(){
    Party testParty = new Party(2,4,0,0, "");
    double resultExpected = 36;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

  @Test
  public void newParty_PriceWith2GuestsAndMealAndBar_56(){
    Party testParty = new Party(2,4,3,0, "");
    double resultExpected = 56;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBar_30(){
    Party testParty = new Party(2,1,3,0, "");
    double resultExpected = 30;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndTeaCoffee_30(){
    Party testParty = new Party(2,1,1,0, "");
    double resultExpected = 12;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndMagician_90(){
    Party testParty = new Party(2,1,3,3, "");
    double resultExpected = 90;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndClowns_60(){
    Party testParty = new Party(2,1,3,2, "");
    double resultExpected = 60;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndClownsAnd20OffCoupon_48(){
    Party testParty = new Party(2,1,3,2, "SUPERDEAL20");
    double resultExpected = 48;
    assertEquals(resultExpected, testParty.partyPrice(), 0.1);
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndMagicianAndFreeMagicianCoupon_30(){
    Party testParty = new Party(2,1,3,3, "MAGICALMAYHEM");
    double resultExpected = 30;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }
  @Test
  public void newParty_PriceWith2GuestsAndLightSnacksAndOpenBarAndMagicianAndDJCoupon_90(){
    Party testParty = new Party(2,1,3,3, "DJDISCOUNT30");
    double resultExpected = 90;
    assertEquals(resultExpected, testParty.partyPrice(), 0.01);
  }

}

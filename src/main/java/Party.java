import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Party{
  private Integer mGuests;
  private Integer mFoodChoice; //0 = no food (g*0), 1 = light snacks(g*2), 2 = hd (g*3), 3 = pizza (g*4), 4 = meal (g*15)
  private Integer mDrinkChoice; //0 = no drinks (g*0), 1 = tea & coffee (g*1), 2 = beer (g*5), 3 = bar (g*10)
  private Integer mEntertainmentChoice; //0 = entertainment, 1 = DJ (+100), 2 = clowns (+30), 3 = Magician (+60), 4 = speaker (+200)
  private String mCoupon; // SUPERDEAL20 20%off, DJDISCOUNT30 $30off with DJ, MAGICALMAYHEM free Magician




  public Integer partyPrice ( Integer guests, Integer foodChoice, Integer drinkChoice, Integer entertainmentChoice, String coupon){
    mGuests = guests;
    Integer price = 0;
    price = mGuests*3;

    mFoodChoice = foodChoice;
    if (mFoodChoice == 0){
      price += mGuests*0;
      return price;
    } else if (mFoodChoice == 1){
      price += mGuests*2;
      return price;
    } else if (mFoodChoice == 2){
      price += mGuests*3;
      return price;
    }else if (mFoodChoice == 3){
      price += mGuests*4;
      return price;
    }else if (mFoodChoice == 4){
      price += mGuests*15;
      return price;
    }else {
      return price;
    }


    // return price;
  }
}

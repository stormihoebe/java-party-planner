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

  public Party(Integer guest, Integer food, Integer drink, Integer entertainment, String coupons) {
    mGuests = guest;
    mFoodChoice = food;
    mDrinkChoice = drink;
    mEntertainmentChoice = entertainment;
    mCoupon = coupons;
  }

  public Integer getGuests(){
    return mGuests;
  }
  public String getFoodChoice(){
    String foodString = "Not a valid Option";
    if (mFoodChoice == 0){
      foodString= "No Food";
    } else if (mFoodChoice == 1){
      foodString= "Light Snacks";
    } else if (mFoodChoice == 2){
      foodString= "Hors Doeuvres";
    }else if (mFoodChoice == 3){
      foodString= "Pizza";
    }else if (mFoodChoice == 4){
      foodString= "Five Course Meal";
    }
    return foodString;
  }
  public String getDrinkChoice(){
    String drinkString = "Not a valid Option";
    if (mDrinkChoice == 0){
      drinkString = "No Drinks";
    } else if (mDrinkChoice == 1){
      drinkString = "Coffee or Tea";
    } else if (mDrinkChoice == 2){
      drinkString = "Beer";
    }else if (mDrinkChoice == 3){
      drinkString = "Open Bar";
    }
    return drinkString;
  }
  public String getEntertainmentChoice(){
    String entertainmentString = "Not a valid Option";
    if (mEntertainmentChoice == 0){
      entertainmentString = "No Entertainment";
    } else if (mEntertainmentChoice == 1){
      entertainmentString = "DJ";
    } else if (mEntertainmentChoice == 2){
      entertainmentString = "Clowns";
    } else if (mEntertainmentChoice == 3){
      entertainmentString = "Magician";
    } else if (mEntertainmentChoice == 4){
      entertainmentString = "Keynote Speaker";
    }
    return entertainmentString;
  }
  public String getCoupon(){
    String couponString = "Coupon code not valid based on your entry";
    if (mCoupon.equals("SUPERDEAL20")){
      couponString = "SUPERDEAL20 -- 20% off your entire event" ;
    } else if (mCoupon.equals("DJDISCOUNT30") && (mEntertainmentChoice == 1)){
      couponString = "DJDISCOUNT30 -- $30 off any party with a DJ";
    } else if (mCoupon.equals("MAGICALMAYHEM") && (mEntertainmentChoice == 3)){
      couponString = "MAGICALMAYHEM -- free magic show";
    }
    return couponString;
  }

  public Integer partyPrice (){
    Integer price = 0;
    price = mGuests*3;
    if (mFoodChoice == 0){
      price += mGuests*0;
    } else if (mFoodChoice == 1){
      price += mGuests*2;
    } else if (mFoodChoice == 2){
      price += mGuests*3;
    }else if (mFoodChoice == 3){
      price += mGuests*4;
    }else if (mFoodChoice == 4){
      price += mGuests*15;
    }
    if (mDrinkChoice == 0){
      price += mGuests*0;
    } else if (mDrinkChoice == 1){
      price += mGuests*1;
    } else if (mDrinkChoice == 2){
      price += mGuests*5;
    }else if (mDrinkChoice == 3){
      price += mGuests*10;
    }
    if (mEntertainmentChoice == 0){
      price += 0;
    } else if (mEntertainmentChoice == 1){
      price += 100;
    } else if (mEntertainmentChoice == 2){
      price += 30;
    } else if (mEntertainmentChoice == 3){
      price += 60;
    } else if (mEntertainmentChoice == 4){
    price += 200;
    }
    if (mCoupon.equals("SUPERDEAL20")){
      price -= (price/5);
    } else if (mCoupon.equals("DJDISCOUNT30") && (mEntertainmentChoice == 1)){
      price -= 30;
    } else if (mCoupon.equals("MAGICALMAYHEM") && (mEntertainmentChoice == 3)){
      price -= 60;
    }
    return price;
  }
}

package dz;

import java.util.Random;

public class Wardrobe {
  int State;
  Random r = new Random();
  String WRName;

  public Wardrobe(int state,String WRName) {
    this.State = state;
    this.WRName = WRName;
    
  }
  
  public  void getDamage(int Damage) {
    // int res = 0;
    if (Damage < this.State) {
      this.State = this.State - Damage;
    }
  }
  public String getState(){
  return String.format("Состояние шкафа: %s %d процентов" , this.WRName,this.State);

}
}



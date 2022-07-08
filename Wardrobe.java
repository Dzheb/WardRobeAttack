package dz;

public class Wardrobe {
  int State;

  public void setState(int state) {
    State = state;
  }

  String WRName;

  public Wardrobe(String WRName) {
    this.State = 100;
    this.WRName = WRName;

  }

  public void getDamage(int Damage) {

    if (Damage < this.State) {
      this.State = this.State - Damage;
    }
  }

  public String getState() {
    return String.format("Состояние шкафа: %s %d процентов", this.WRName, this.State);

  }
}

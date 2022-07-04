package dz;

public class Kupe extends Wardrobe {
  String type = "Купе";
  int state;

  public Kupe(int state,String WRName) {
    super(state,WRName);

  }
  public String getType() {
    return type;
  }

}

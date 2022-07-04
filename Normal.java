package dz;

public class Normal extends Wardrobe{
  String type = "Обычный";

  public Normal(int state, String WRName) {
    super(state,WRName);
  }
  public String getType() {
    return type;
}
}

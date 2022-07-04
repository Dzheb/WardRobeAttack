package dz;

class  Rentor extends Human{
  String status = "Съёмщик";

  public String getStatus() {
    return status;
  }
  public Rentor(String pername,int hands,int fingers,int head) {
    super(pername,hands,fingers,head);
  }
}

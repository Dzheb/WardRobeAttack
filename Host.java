package dz;

public class Host extends Human{
  String status = "Хозяин";

  public String getStatus() {
    return status;
  }

  public Host(String pername,int hands,int fingers,int head) {
    super(pername,hands,fingers,head);
    
    
  }
  
}

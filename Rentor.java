package dz;

// Съёмшик - может только отремонтировать шкаф
public class  Rentor extends Human  implements WrRepair {
  String Pername;
 
  public Rentor(String pername) {
    super(pername);
    this.Pername = pername;
    super.status = "съёмщик";

  }
  public Rentor(String pername,int hands,int fingers,int head) {
    super(pername,hands,fingers,head);
  }
  @Override
  public void repair(Wardrobe target) {
    target.State += WardrobeAttack.r.nextInt(0, 100 - target.State);
        
  }
  
}

package dz;

// Хозяин - может отремонтировать шкаф и заменить на новый
public  class  Host extends Human implements WrReplace,WrRepair  {
  String Pername;
  
  public Host(String pername) {
    super(pername);
    this.Pername = pername;
    super.status = "хозяин";
  }
  public Host(String pername,int hands,int fingers,int head) {
    super(pername,hands,fingers,head);
  }
  @Override
  public void repair(Wardrobe target) {
    target.State += WardrobeAttack.r.nextInt(0, 100 - target.State);
        
  }
  @Override
  public void replace(Wardrobe target) {
    target.State = 100;
    target.WRName = "Новый " + target.WRName;
    
  }
}

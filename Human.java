package dz;

public class Human extends HumanParts {

  String Pername;
  String status;
  
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  // 2 перегрузки
  public Human(String pername, int fingers, int hands, int head) {
    super(fingers, hands, head);
    this.Pername = pername;

  }
  public Human(String pername) { 
    this.Pername = pername;

  }

  public String getPerson() {
    return String.format("Имя: %s - %s, состояние -  %d процентов головы, %d руки на которых %d пальцев", this.Pername, this.status,
        this.Head, this.Hands,
        this.Fingers);
  }

  public void Attack(Wardrobe target) {
    int damage = WardrobeAttack.r.nextInt(0, target.State);
    super.Head = WardrobeAttack.r.nextInt(0, super.Head);
    super.Fingers = WardrobeAttack.r.nextInt(0, super.Fingers);
    if (super.Fingers < 5) {
      super.Hands = 1;
    } else if (super.Fingers == 0)
      super.Hands = 0;

    target.getDamage(damage);
  }
  
}

package dz;

import java.util.Random;

public class Human {
  String Pername;
  int Fingers;
  int Hands;
  int Head;
  Random r;

  public Human(String pername,int hands,int fingers,int head) {
    r = new Random();
    this.Pername = pername;
    this.Fingers = fingers;
    this.Head = head;
    this.Hands = hands;
  }

  public String getPerson() {
    return String.format("Имя: %s , состояние -  %d процентов головы, %d руки на которых %d пальцев", this.Pername, this.Head, this.Hands,
        this.Fingers);
  }
  public void Attack(Wardrobe target){
      int damage = r.nextInt(0,target.State);
      this.Head = r.nextInt(0,this.Head);
      this.Fingers = r.nextInt(0,this.Fingers);
      if (this.Fingers < 5) {
        this.Hands = 1;
      } else if (this.Fingers == 0) this.Hands = 0;
      

      target.getDamage(damage);
  }
}

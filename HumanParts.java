package dz;

public class HumanParts {
  protected int Fingers;
  protected int Hands;
  protected int Head;
  // 2 перегрузки (2 параметра и 
  public HumanParts(int fingers,int hands,int head) {
    this.Fingers = fingers;
    this.Hands = hands;
    this.Head = head;
  
  }
  // 0 пераметров)
  public HumanParts() {
    this.Fingers = 10;
    this.Hands = 2;
    this.Head = 100;
  
  }

  public int getFingers() {
    return Fingers;
  }

  public int getHands() {
    return Hands;
  }

  public int getHead() {
    return Head;
  }

}

package dz;

/**
 * Wardrobe
 */
public class WardrobeAttack {

  public static void main(String[] args) {
    // полиморфизм
    Human clever = new Host("Вася",2,10,100);
    Human stupid = new Rentor("Петя",2,10,100);
    // полиморфизм
    Wardrobe w1 = new Kupe(100,"Шкаф1");
    Wardrobe w2 = new Normal(100,"Шкаф2");
    
    System.out.println("Здравствуй шкаф!");
    // умный атакует шкаф1
    clever.Attack(w1);
    System.out.printf("%s атакует %s",clever.Pername,w1.WRName);
    System.out.println();
    System.out.println(w1.getState());
    System.out.println(clever.getPerson());
    System.out.println();
    // неумный атакует шкаф2
    stupid.Attack(w2);
    System.out.printf("%s атакует %s",stupid.Pername,w2.WRName);
    System.out.println();
    System.out.println(w2.getState());
    System.out.println(stupid.getPerson());
  }
}

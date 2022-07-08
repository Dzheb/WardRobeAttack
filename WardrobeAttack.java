package dz;

import java.util.Random;

public class WardrobeAttack {
  // Random вынесен в статику
  static Random r;

  public static void main(String[] args) {
    r = new Random();
    // полиморфизм
    Human rentor = new Rentor("Вася");
    Human owner = new Host("Петя");
    // полиморфизм
    Wardrobe w1 = new Kupe("Шкаф1");
    Wardrobe w2 = new Normal("Шкаф2");
        
    System.out.printf("Здравствуй шкаф 1- %s !\n",((Kupe) w1).getType());
    System.out.printf("Здравствуй шкаф 2- %s !\n",((Normal) w2).getType());
    System.out.println();
    
    // съёмщик атакует шкаф1
    rentor.Attack(w1);
    System.out.printf("%s атакует %s\n",rentor.Pername,w1.WRName);
    System.out.println("Итог: ");
    System.out.println(w1.getState());
    System.out.println(rentor.getPerson());
    System.out.println("----------------------------------------------------");
    // хозяин атакует шкаф2
    owner.Attack(w2);
    System.out.printf("%s атакует %s\n",owner.Pername,w2.WRName);
    System.out.println("Итог: ");
    System.out.println(w2.getState());
    System.out.println(owner.getPerson());
    // ремонт шкафа
    System.out.println("-----------------------------------------------------");
    System.out.println("Восстановление: ");
    System.out.printf("%s %s заменил %s \n",owner.Pername,owner.status,w2.WRName);
    ((Host) owner).replace(w2);
    System.out.println(w2.getState());
    System.out.println();
    // замена шкафа
    System.out.printf("%s %s отремонтировал %s \n",rentor.Pername,rentor.status,w1.WRName);
    ((Rentor) rentor).repair(w1);
    System.out.println(w1.getState());
  }
  
  
}
